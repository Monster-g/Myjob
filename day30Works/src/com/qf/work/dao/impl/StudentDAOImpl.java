package com.qf.work.dao.impl;

import com.qf.work.dao.StudentDAO;
import com.qf.work.entity.Student;
import com.qf.work.utils.DBConnection;
import com.qf.work.utils.SQLConstants;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    @Override
    public List<Student> findAll() throws SQLException {
        //声明一个Student类的集合，引用了泛型
        List<Student> list = new ArrayList<>();
        //获取数据库操作对象
        final PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(SQLConstants.STUDENT_FIND_ALL);
        //执行SQL
        final ResultSet resultSet = preparedStatement.executeQuery();
        //得到集合里的数据
        while (resultSet.next()){
            list.add(new Student(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("sex"),
                    resultSet.getInt("age")
            ));
        }
        return list;
    }

    @Override
    public Student findById(Integer id) throws SQLException {
        //获取数据库操作对象
        final PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(SQLConstants.STUDENT_FIND_BY_ID);
        //执行SQL
        final ResultSet resultSet = preparedStatement.executeQuery();
        //得到查询结果
        while (resultSet.next()){
            return new Student(
              resultSet.getInt("id"),
              resultSet.getString("name"),
              resultSet.getString("sex"),
              resultSet.getInt("age")
            );
        }
        return null;
    }

    @Override
    public int insert(Student student) throws SQLException {
        //获取数据库操作对象
        final PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(SQLConstants.STUDENT_INSERT);
        //执行SQL,添加数据
        preparedStatement.setInt(1,student.getId());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setString(3, student.getSex());
        preparedStatement.setInt(4, student.getAge());
        return preparedStatement.executeUpdate();
    }

    @Override
    public int update(Student student) throws SQLException {
        final PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(SQLConstants.STUDENT_UPDATE);
        //执行SQL,添加数据
        preparedStatement.setInt(1,student.getId());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setString(3, student.getSex());
        preparedStatement.setInt(4, student.getAge());
        return preparedStatement.executeUpdate();
    }

    @Override
    public int delete(Integer id) throws SQLException {
        final PreparedStatement preparedStatement = DBConnection.getConnection().prepareStatement(SQLConstants.STUDENT_DELETE);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate();
    }
}
