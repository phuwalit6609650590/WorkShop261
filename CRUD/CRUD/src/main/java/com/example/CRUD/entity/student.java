package com.example.CRUD.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name = "eng_name", nullable = false)
    private String engName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "faculty", nullable = false)
    private String faculty;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "user_name", nullable = false)
    private String userName;

    public student(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", engName='" + engName + '\'' +
                ", email='" + email + '\'' +
                ", faculty='" + faculty + '\'' +
                ", type='" + type + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
