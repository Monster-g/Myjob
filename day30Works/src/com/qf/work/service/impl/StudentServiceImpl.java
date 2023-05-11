package com.qf.work.service.impl;

import com.qf.work.dao.StudentDAO;
import com.qf.work.dao.impl.StudentDAOImpl;
import com.qf.work.entity.Student;
import com.qf.work.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDAO studentDAO = new StudentDAOImpl();
    @Override
    public List<Student> findAll() {
        try {
            return studentDAO.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Student findById(Integer id) {
        try {
            return studentDAO.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int insert(Student student) {
        try {
            return studentDAO.insert(student);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Student student) {
        try {
            return studentDAO.update(student);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(Integer id) {
        try {
            return studentDAO.delete(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}
