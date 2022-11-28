package com.avenue.java.spb.group2.lesson18.homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


/*3
        Введи с клавиатуры 20 слов в список. Посчитай, сколько раз каждое из них встречается в списке.
                Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр - уникальное слово, а второй - число раз, сколько раз данное слово встречалось в списке.

        Выведи содержимое словаря на экран.
                В тестах регистр (большая/маленькая буква) влияет на результат.

        public static void main(String[] args) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            ArrayList<String> words = new ArrayList<String>();
            for (int i = 0; i < 20; i++) {
                words.add(reader.readLine());
            }

            Map<String, Integer> map = countWords(words);

            for (Map.Entry<String, Integer> pair : map.entrySet()) {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }
        }

        public static Map<String, Integer> countWords(ArrayList<String> list) {
            HashMap<String, Integer> result = new HashMap<String, Integer>();

            //напишите тут ваш код


            return result;
        }*/



public class Task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j))){
                    count++;
                }
            }
            result.put(list.get(i), count);
            count=0;
        }

        return result;
    }
}
