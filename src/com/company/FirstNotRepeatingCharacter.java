package com.company;

import java.util.HashSet;
import java.util.Set;

public class FirstNotRepeatingCharacter {

    char solution(String s) {
        char data='_';
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
                System.out.println("First non-repeating character is "+ s.charAt(i));
                data=s.charAt(i);
                break;
            }
        }
        return data;
    }

    char solution2(String s) {

        System.out.println(s.length());

        Set<String> set = new HashSet<String>();
        Set<String> set1 = new HashSet<String>();
        set.add(String.valueOf(s.charAt(0)));
        set1.add(String.valueOf(s.charAt(0)));
        for(int i=1;s.length()>i;i++){
             if(!set.contains(String.valueOf(s.charAt(i)))){
                 set1.add(String.valueOf(s.charAt(i)));
             }else {
                 set1.remove(String.valueOf(s.charAt(i)));
             }
            set.add(String.valueOf(s.charAt(i)));
        }
        return set1.isEmpty() ? '_':set1.iterator().next().charAt(0);
    }
}
