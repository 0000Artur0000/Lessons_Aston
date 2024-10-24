package com.arzer0.lessons.lesson1.homework.system_facultative.model;

public class Course {
    private final String name;
    private Teacher teacher;

    public Course(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}