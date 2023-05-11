package com.qf.work.utils;

public interface SQLConstants {
    //student数据库操作
    String STUDENT_FIND_ALL = "SELECT id, name, sex, age FROM student";
    String STUDENT_FIND_BY_ID = "SELECT id, name, sex, age FROM student WHERE id = ?";
    String STUDENT_INSERT = "INSERT INTO student(id, name, sex, age) VALUES(?, ?, ?, ?);";
    String STUDENT_UPDATE = "UPDATE student SET id = ?, name = ?, sex = ?, age = ?";
    String STUDENT_DELETE = "DELETE FROM student WHERE id = ?";
}
