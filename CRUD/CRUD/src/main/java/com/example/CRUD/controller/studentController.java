package com.example.CRUD.controller;

import com.example.CRUD.DAO.StudentRepository;
import com.example.CRUD.entity.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/student")
public class studentController {


    @Autowired
    private StudentRepository studentService;

    @PostMapping("/add")
    public ResponseEntity<student> addStudent(@RequestBody student student) {
        student savedStudent = studentService.save(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<student>> getAllStudents() {
        List<student> students = studentService.getAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody student student) {
        try {
            student savedStudent = studentService.save(student);
            return ResponseEntity.ok(savedStudent);  // ส่งข้อมูลกลับในรูปแบบ JSON
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error: " + e.getMessage());
        }
    }


}
