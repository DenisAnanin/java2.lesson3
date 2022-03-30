package ru.gb.java2.lesson3;

import java.util.*;

public class App {
    public static void main(String[] args) {
        counting();
    }

    public static void counting() {
        ArrayList<String> words = new ArrayList<>();
        words.add("Три");
        words.add("Три");
        words.add("Один");
        words.add("Один");
        words.add("Три");
        words.add("Пять");
        words.add("Два");
        words.add("Пять");

        HashSet<String> temp = new HashSet<>(words);
        for (String s : temp) {
            int t = 0;
            for (String s1 : words) {
                if(s.equals(s1)){
                t++;
                }
            }
            System.out.println("Слово " + s + " повторяется " + t);
        }
    }
}
