package com.arzer0.lessons.lesson3.homework;

import com.arzer0.lessons.lesson3.homework.linked_list.MyLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> test = new MyLinkedList<>();
        for (int i = 0; i<100; i++)
            test.add(new Random().nextInt(1000));

        System.out.println("Неотсортированный лист:\n"+test);
        MyLinkedList.sort(test);
        System.out.println("Отсортированный лист:\n"+test);
        List<Integer> testList = new ArrayList<>(List.of(6, 2, 1, 4, 5));
        MyLinkedList<Integer> test2 = new MyLinkedList<>(testList);
        System.out.println("Лист до удаления:\n"+test2);
        test2.remove(3);
        System.out.println("Лист после удаления:\n"+test2);
    }
}
