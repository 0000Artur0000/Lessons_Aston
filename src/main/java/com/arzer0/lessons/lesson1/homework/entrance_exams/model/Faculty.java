package com.arzer0.lessons.lesson1.homework.entrance_exams.model;

import java.util.List;

public class Faculty {
    private final String name;
    List<Teacher> examTeachers; ;

    public List<Teacher> examTeachers() {
        return examTeachers;
    }



    public Faculty(String name, List<Teacher> examTeachers) {
        this.name = name;
        this.examTeachers = examTeachers;
    }

    public String getName() {
        return name;
    }
}