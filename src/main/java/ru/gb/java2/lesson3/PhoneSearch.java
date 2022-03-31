package ru.gb.java2.lesson3;

import java.util.*;

public class PhoneSearch {
    private final HashMap<String, String> directory = new HashMap<>();

    public void add(String phone, String surname) {
        directory.put(phone, surname);
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
