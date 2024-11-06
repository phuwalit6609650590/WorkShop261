package com.example.CRUD.DAO;

import com.example.CRUD.entity.student;

import java.util.List;

public interface studentDAO {
    student save(student student);
    public student findByUsername(String username) ;
    void delete(Integer id);
    student get(Integer id);
    List<student> getAll();
    void update(student student);
}
