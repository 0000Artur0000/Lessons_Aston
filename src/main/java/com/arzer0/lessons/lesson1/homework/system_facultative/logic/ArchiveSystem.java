package com.arzer0.lessons.lesson1.homework.system_facultative.logic;

import com.arzer0.lessons.lesson1.homework.system_facultative.model.*;

import java.util.ArrayList;
import java.util.List;

public class ArchiveSystem {
    private static List<Student> archivedStudents = new ArrayList<>();

    public static void archiveGrade(Student student, Course course) {
        List<Grade> grades = student.getGrades();

        for (Grade grade : grades) {
            System.out.println("Оценка студента " + student.getName() + " по курсу " + course.getName() + ": " + grade.getScore());
            if (!archivedStudents.contains(student)) {
                archivedStudents.add(student);
                System.out.println("Оценка сохранена в архиве.");
            }

        }
    }

    public static List<Student> getArchivedStudents() {
        return archivedStudents;
    }
}
