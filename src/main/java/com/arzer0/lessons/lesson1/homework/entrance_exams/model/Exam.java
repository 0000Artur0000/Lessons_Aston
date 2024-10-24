package com.arzer0.lessons.lesson1.homework.entrance_exams.model;

public class Exam {


    private final String examName;
    private int score;
    private Teacher teacher;

    public Exam(String examName, Teacher teacher) {
        this.examName = examName;
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public int getScore() {
        return score;
    }

    public String getExamName() {
        return examName;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
