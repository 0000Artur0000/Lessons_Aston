package com.arzer0.lessons.lesson1.homework.entrance_exams.model;

import java.util.ArrayList;
import java.util.List;


public class Abiturient {
    private final String name;
    private Faculty faculty;
    private List<Exam> exams = new ArrayList<>();

    public Abiturient(String name) {
        this.name = name;
    }

    public void registerForFaculty(Faculty faculty) {
        this.faculty = faculty;
        System.out.println("Абитуриент "+ name +" зарегистрировался на факультет: " + faculty.getName());
    }

    public void takeExam(Exam exam) {
        exams.add(exam);
    }

    public List<Exam> getExams() {
        return exams;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public String getName() {
        return name;
    }
}
