package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

class IntWrapper {
    public Integer value;

    public IntWrapper(Integer value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        IntWrapper a = new IntWrapper(2);
        List<Integer> list = new ArrayList() {{
            add(1);
            add(2);
        }};
        add(a); // Вызов метода с объектом IntWrapper
        add(list); // Вызов метода со списком
        System.out.println(a.value); // Вывод значения a
        System.out.println(list); // Вывод списка list
    }

    // Метод для увеличения значения в IntWrapper
    public static void add(IntWrapper a) {
        a.value++;
    }

    // Метод для добавления 5 в список
    public static void add(List<Integer> list) {
        list.add(5);
    }
}