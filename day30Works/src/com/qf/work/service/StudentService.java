package com.qf.work.service;

import com.qf.work.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Integer id);
    int insert(Student student);
    int update(Student student);
    int delete(Integer id);
}
