package ru.gb.java2.lesson3;

import java.util.*;

public class App {
    public static void main(String[] args) {
        counting();
        PhoneSearch directory = new PhoneSearch();
        directory.create();
        directory.add("8(495)","Иванов");
        directory.get("Иванов");

    }

    public static void counting() {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Один","Два","Три","Два","Два","Два","Один","Пять"));

        HashSet<String> temp = new HashSet<>(words);

        for (String s : temp) {
            int t = 0;
            for (String s1 : words) {
                if (s.equals(s1)) {
                    t++;
                }
            }
            System.out.println("Слово " + s + " повторяется " + t);
        }
    }
}
