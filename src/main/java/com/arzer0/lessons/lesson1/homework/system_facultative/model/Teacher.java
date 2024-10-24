package com.arzer0.lessons.lesson1.homework.system_facultative.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private final String name;
    private List<Course> availableCourses = new ArrayList<>();

    public Teacher(String name) {
        this.name = name;
    }

    public void announceCourse(Course course) {
        availableCourses.add(course);
        course.setTeacher(this);
        System.out.println("Преподаватель " + name + " объявил новый курс: " + course.getName());
    }

    public void gradeStudent(Student student, Course course, int score) {
        Grade grade = new Grade(course, score);
        student.addGrade(grade);
    }

    public List<Course> getAvailableCourses() {
        return availableCourses;
    }

    public String getName() {
        return name;
    }
}