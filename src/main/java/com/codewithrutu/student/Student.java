package com.codewithrutu.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Student()
    {
        System.out.println("Inside student constructor");
    }

    public Student(String name)
    {
        this.name=name;
    }

    @Override
    public String toString()
    {
        return "Student{"+
                "id="+
                ",name=' "+name + '\''+
                '}';
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
}




