package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    public void save(Student thestudent);
    public Student findById(int id);

    List<Student> findAll();

    List<Student> findStudentByLastName(String lname);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
