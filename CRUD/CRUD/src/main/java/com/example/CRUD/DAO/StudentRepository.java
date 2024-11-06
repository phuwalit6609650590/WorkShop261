package com.example.CRUD.DAO;

import com.example.CRUD.entity.student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository implements  studentDAO{

    private EntityManager entityManager;

    @Autowired
    public StudentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Override
    @Transactional
    public student save(student student) {
        entityManager.persist(student);
        return  student;
    }

    @Override
    public student findByUsername(String username) {
        String jpql = "SELECT s FROM student s WHERE s.userName = :username";
        return entityManager.createQuery(jpql, student.class)
                .setParameter("username", username)
                .getSingleResult();
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        student student= entityManager.find(student.class,id);
        entityManager.remove(student);
    }

    @Override
    public student get(Integer id) {
        return entityManager.find(student.class,id);

    }

    @Override
    public List<student> getAll() {
        TypedQuery<student> query = entityManager.createQuery("FROM student",student.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void update(student student) {
        entityManager.merge(student);

    }
}
