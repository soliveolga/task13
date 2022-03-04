package com.task13.idea;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввести сюда текст из задания:");   // I love java 8 Я люблю java 14 core1
        String string = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(string);
        int count = 0;

        while(tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            boolean allLettersLatin = true;

            for(int i = 0; i < word.length(); ++i) {
                char currentChar = word.charAt(i);
                if ((currentChar < 'A' || currentChar > 'Z') && (currentChar < 'a' || currentChar > 'z')) {
                    allLettersLatin = false;
                    break;
                }
            }

            if (allLettersLatin) {
                System.out.println(word);
                ++count;
            }
        }

        System.out.println("Количество слов состоящих только из латницы: " + count);
    }
}
