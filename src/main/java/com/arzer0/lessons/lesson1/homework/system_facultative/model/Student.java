package com.arzer0.lessons.lesson1.homework.system_facultative.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private List<Course> courses = new ArrayList<>();
    private List<Grade> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        System.out.println("Студент " + name + " Начал обучение: " + course.getName());
    }


    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }
}
