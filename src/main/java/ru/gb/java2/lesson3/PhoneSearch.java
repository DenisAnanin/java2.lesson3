package ru.gb.java2.lesson3;

import java.util.*;

public class PhoneSearch {
    private final AbstractMap<String, String> directory = new HashMap<>();

    public void create() {

        directory.put("8(495)000-00-00", "Иванов");
        directory.put("8(495)000-00-01", "Петров");
        directory.put("8(495)000-00-02", "Иванов");
        directory.put("8(495)000-00-03", "Сидоров");
    }

    public void add(String s1, String s2) {
        directory.put(s1, s2);
    }

    public void get(String s) {
        if (directory.containsValue(s)) {
            for (Map.Entry<String, String> o : directory.entrySet()) {
                if (o.getValue().equals(s)) {
                    System.out.println(o.getValue() + " - " + o.getKey());
                }
            }
        } else {
            System.out.println("Такого значения нет в справочнике");
        }
    }
}
