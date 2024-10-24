package com.arzer0.lessons.lesson1.homework.system_facultative;

import com.arzer0.lessons.lesson1.homework.system_facultative.logic.ArchiveSystem;
import com.arzer0.lessons.lesson1.homework.system_facultative.model.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        List<Teacher> teachers = Arrays.asList(
                new Teacher("Петр Петров"),
                new Teacher("Анна Иванова"),
                new Teacher("Сергей Сергеев")
        );

        List<Course> courses = Arrays.asList(
                new Course("Программирование"),
                new Course("Математика"),
                new Course("Физика")
        );

        for(int i=0;i<3;i++ ) {
            teachers.get(i).announceCourse(courses.get(i));
        }

        List<Student> students = Arrays.asList(
                new Student("Иван Иванов"),
                new Student("Мария Петрова"),
                new Student("Алексей Смирнов"),
                new Student("Ольга Кузнецова"),
                new Student("Дмитрий Соколов")
        );
        Random random = new Random();

        for (Student student : students) {
            Course course = courses.get(random.nextInt(courses.size()));
            student.enrollInCourse(course);
        }

        for (Student student : students) {
            for (Course course : student.getCourses()){
                Teacher teacher = teachers.get(courses.indexOf(course));
                teacher.gradeStudent(student, course, random.nextInt(4)+2);
                ArchiveSystem.archiveGrade(student, course);
            }
        }
        System.out.println("Чтение Архивов:");
        for (Student student : ArchiveSystem.getArchivedStudents()) {
            for (Course course : student.getCourses()) {
                List<Grade> grades = student.getGrades();
                for (Grade grade : grades) {
                    System.out.println("Оценка студента " + student.getName() + " по курсу " + course.getName() + ": " + grade.getScore());
                }

            }
        }
    }
}
