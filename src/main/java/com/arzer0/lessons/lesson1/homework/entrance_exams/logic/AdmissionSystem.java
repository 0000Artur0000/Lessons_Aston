package com.arzer0.lessons.lesson1.homework.entrance_exams.logic;

import com.arzer0.lessons.lesson1.homework.entrance_exams.model.*;

import java.util.List;

public class AdmissionSystem {
    public static double calculateAverageScore(Abiturient abiturient) {
        List<Exam> exams = abiturient.getExams();
        double totalScore = 0;
        for (Exam exam : exams) {
            totalScore += exam.getScore();
        }
        return totalScore / exams.size();

    }

    public static void determineAdmission(Abiturient abiturient) {
        double averageScore = calculateAverageScore(abiturient);
        if (averageScore >= 3) {
            System.out.println("Абитуриент " + abiturient.getName() + " зачислен на "+abiturient.getFaculty().getName());
        } else {
            System.out.println("Абитуриент " + abiturient.getName() + " не зачислен на "+abiturient.getFaculty().getName());
        }
    }
}
