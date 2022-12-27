package com.company;

public class StringPalindromCheck {
    boolean stringPalindromCheck(String inputString) {
        String reversString="";
        String lowercase= inputString.toLowerCase();
        for(int i= lowercase.length()-1;i>=0;i-- ){
            reversString= reversString+lowercase.charAt(i);
        }
        return lowercase.equals(reversString);
    }
}
