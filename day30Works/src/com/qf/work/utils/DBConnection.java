package com.qf.work.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
    //加载配置文件集合
    private static final  Properties PROPERTIES= new Properties();
    //创建线程共享的集合对象
    private static final ThreadLocal<Connection> THREAD_LOCAL = new ThreadLocal<>();
    //创建连接池
    private static DataSource dataSource;

    static {
        //加载驱动
        try {
            //读取资源文件
            final InputStream inputStream = DBConnection.class.getResourceAsStream("/druid.properties");
            //将配置文件信息加载到集合中
            PROPERTIES.load(inputStream);
            //创建druid连接池
            dataSource = DruidDataSourceFactory.createDataSource(PROPERTIES);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取连接对象
    public static Connection getConnection() throws SQLException {
        //在线程共享对象集合中获取当前连接
        Connection connection = THREAD_LOCAL.get();
        //判断是否存在连接
        if (connection != null && !connection.isClosed()) {
            return connection;
        } else {
            //如果不存在连接则创建连接
            connection = dataSource.getConnection();
            //将连接放入到线程共享对象集合中
            THREAD_LOCAL.set(connection);
            return connection;
        }
    }

    //关闭当前连接
    public static void close() throws SQLException {
        //在线程共享对象集合中获取当前连接
        Connection connection = THREAD_LOCAL.get();
        //判断是否存在连接
        if (connection != null && !connection.isClosed()){
            //关闭连接
            connection.close();
            //删除连接
            THREAD_LOCAL.remove();
            //置空连接
            connection = null;
        }
    }

    public static void main(String[] args) throws SQLException {
        System.out.println(getConnection());
    }
}
