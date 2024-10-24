package com.arzer0.lessons.lesson1.homework.entrance_exams;

import com.arzer0.lessons.lesson1.homework.entrance_exams.logic.AdmissionSystem;
import com.arzer0.lessons.lesson1.homework.entrance_exams.model.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
Система Вступительные экзамены. Абитуриент регистрируется на Факультет, сдает Экзамены.
Преподаватель выставляет Оценку. Система подсчитывает средний балл и определяет Абитуриентов,
зачисленных в учебное заведение.
*/

public class App {
    public static void main(String[] args) {
        List<Abiturient> abiturients = Arrays.asList(
                new Abiturient("Иван Иванов"),
                new Abiturient("Мария Петрова"),
                new Abiturient("Алексей Смирнов"),
                new Abiturient("Ольга Кузнецова"),
                new Abiturient("Дмитрий Соколов")
        );
        List<Teacher> teachers = Arrays.asList(
                new Teacher("Никита Иванович", "Математика"),
                new Teacher("Марина Васильевна", "Русский язык"),
                new Teacher("Алексей Петрович", "Программирование")

        );

        List<Teacher> teachers2 = Arrays.asList(
                teachers.get(0),
                teachers.get(1),
                new Teacher("Вадим Вадимович", "Физика")
        );

        List<Faculty> faculties = Arrays.asList(
                new Faculty("Факультет информатики", teachers),
                new Faculty("Факультет физики", teachers2)
        );

        Random random = new Random();

        for (Abiturient abiturient : abiturients) {
            Faculty faculty = faculties.get(random.nextInt(faculties.size()));
            abiturient.registerForFaculty(faculty);
            for (Teacher teacher : faculty.examTeachers()) {
                Exam exam = new Exam(teacher.getExamName(), teacher);
                abiturient.takeExam(exam);
                exam.getTeacher().gradeExam(exam, random.nextInt(4)+2);
                System.out.println("Абитуриент "+abiturient.getName()+" сдал экзамен по предмету " +exam.getExamName()+ " на оценку " + exam.getScore());
            }
        }
        for (Abiturient abiturient : abiturients) {

            System.out.println("Средний балл абитуриента " + abiturient.getName() + ": " + AdmissionSystem.calculateAverageScore(abiturient));
            AdmissionSystem.determineAdmission(abiturient);
        }


    }
}