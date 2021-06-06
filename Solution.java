package com.anz.cobra.common.app.utils.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) throws IOException {

        Map<String, String> map = new HashMap<String, String>() {{
            put("4", "Four");
            put("1", "One");
            put("3", "Three");
            put("2", "Two");
        }};

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
            .forEach(k -> linkedHashMap.put(k.getKey(), k.getValue()));

        linkedHashMap.keySet().stream().forEach(k -> System.out.println(k + " -> " + linkedHashMap.get(k)));

//        char[] chars = "SomeString".toCharArray();
//        String trimmedStr = new String();
//
//        for (int i = 0; i < chars.length; i++) {
//            if(i <= chars.length && chars[i] != chars[i+1] ) {
//                trimmedStr = trimmedStr + chars[i];
//            }
//        }
//        System.out.println(trimmedStr);

        String str = "abcdef";
        String[] atrArray = str.split("");
        String newString = String.valueOf(atrArray);

        int n = 'A';
        System.out.println(n);

        String a = "abc";
        String b= "def";

        a = b+a;
        b = a.substring(a.length() - b.length(), a.length());
        a = a.replace(b,"");

        System.out.println(a + " " +b);

        int c = 23;
        int d = 43;

        (d +","+c).split(",");

        int[] array = new int[]{1,12,34,23,12,22, 44};
        int highest = array[0] > array[1] ? array[0] : array[1];
        int secondHighest = array[0] < array[1] ? array[0] : array[1];
        for(int i=2 ; i < array.length; i++) {
            if(array[i] > highest) {
                secondHighest = highest;
                highest = array[i];
            } else if (array[i] > secondHighest && array[i] < highest) {
                secondHighest = array[i];
            }
        }
        System.out.println("Highest : "+ highest);
        System.out.println("Second Highest : "+ secondHighest);

        Path path = Paths.get("C:\\NotBackedUp\\Bitbucket\\CobraMicroservice-new\\customeruser\\customeruser-app\\target\\surefire-reports");
        Stream<Path> paths = Files.walk(path);

        paths.forEach(p -> {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(p.toFile()));
                String line = new String();
                while ((line = reader.readLine()) != null) {
                    if (line.contains("Failures:")) {

                    }
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        });
    }
}
