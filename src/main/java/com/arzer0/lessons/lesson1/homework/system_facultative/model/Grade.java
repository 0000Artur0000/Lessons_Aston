package com.arzer0.lessons.lesson1.homework.system_facultative.model;

public class Grade {
    private final Course course;
    private final int score;

    public Grade(Course course, int score) {
        this.course = course;
        this.score = score;
    }

    public Course getCourse() {
        return course;
    }

    public int getScore() {
        return score;
    }
}