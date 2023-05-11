package com.qf.work.service;

import com.qf.work.entity.Student;
import com.qf.work.service.impl.StudentServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class StudentServiceTest {

    private StudentService studentService;
    @Before
    public void setUp() throws Exception {
        studentService = new StudentServiceImpl();
    }

    @Test
    public void findAll() {
        final List<Student> list = studentService.findAll();
        //断言
        Assert.assertTrue(list.size() >= 2);
    }

    @Test
    public void findById() {
        assertNotNull(studentService.findById(1));
    }

    @Test
    public void insert() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }
}