package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    // define entityManager
    private EntityManager entityManager;
    // define constructor to inject dependency
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //define save method
    @Override
    @Transactional
    public void save(Student thestudent) {
    entityManager.persist(thestudent);
    }

    @Override
    public Student findById(int id) {
    return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> theResult=entityManager.createQuery("From Student order by lastName DESC",Student.class);
//        TypedQuery<Student> theResult=entityManager.createQuery("From Student where lastName=:theDemo",Student.class);
//        theResult.setParameter("theDemo","Ram");
        List<Student> ls=theResult.getResultList();
        return ls;
    }

    @Override
    public List<Student> findStudentByLastName(String lname) {
        TypedQuery<Student> theResult=entityManager.createQuery("From Student where lastName=:thelname",Student.class);
        theResult.setParameter("thelname",lname);
        return theResult.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
    entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
    Student theStud=entityManager.find(Student.class,id);
    entityManager.remove(theStud);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int n=entityManager.createQuery("DELETE FROM Student").executeUpdate();

        return n;
    }
}
