package com.example.etats_lot3.Utils;

import java.util.*;
import java.util.stream.Collectors;

class Said {
    public static List<Integer> findSubstring(String s, String[] words) {
        List<String> all_possible_value = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int words_array_length = words.length;
        if (s.length() >= words.length * words[0].length()) {
            int i = s.length() - words.length * words[0].length();
            for (int inc = 0; inc <= i; inc++) {
                all_possible_value.add(s.substring(inc, words.length * words[0].length() + inc));
            }
        }
        for (String val : all_possible_value) {
            boolean t = true;
            for (String tt : words) {
                if (!val.contains(tt))
                    t = false;
                int a = Arrays.stream(words).filter(e -> e == tt).collect(Collectors.toList()).size();
                int b = countOccurrences(s, val);
                System.out.println(a);
                System.out.println(b);
                if (a != b)
                    t = false;
            }
            if (t) {
                int index = s.indexOf(val);
                if (index != -1) {
                    result.add(index);
                }
                while (index >= 0) {
                    index = s.indexOf(val, index + 1);
                    if (index != -1) {
                        result.add(index);
                    }

                }

            }
        }
        return result;

    }

    public static int countOccurrences(String text, String target) {
        int count = 0;
        int index = 0;

        while ((index = text.indexOf(target, index)) != -1) {
            count++;
            index += target.length();
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "wordgoodgoodgoodbestword";
        String words[] = {"word", "good", "best", "word"};
        System.out.println(findSubstring(s, words));
    }
}

