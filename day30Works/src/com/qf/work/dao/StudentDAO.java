package com.qf.work.dao;

import com.qf.work.entity.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {
    List<Student> findAll() throws SQLException;
    Student findById(Integer id) throws SQLException;
    int insert(Student student) throws SQLException;
    int update(Student student) throws SQLException;
    int delete(Integer id) throws SQLException;
}
