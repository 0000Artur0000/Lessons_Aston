package com.arzer0.lessons.lesson1.homework.entrance_exams.model;

public class Teacher {
    private final String name;
    private final String examName;

    public Teacher(String name, String examName) {
        this.name = name;
        this.examName = examName;
    }

    public String getExamName(){
        return examName;
    }

    public void gradeExam(Exam exam, int score) {
        exam.setScore(score);
    }

    public String getName() {
        return name;
    }
}