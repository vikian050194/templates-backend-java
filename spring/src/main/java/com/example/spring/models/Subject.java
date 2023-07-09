package com.example.spring.models;

import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subject {

    @Id
    // SQLite
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    // H2 & PostgreSQL
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    public Subject() {
    }

    public Subject(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
