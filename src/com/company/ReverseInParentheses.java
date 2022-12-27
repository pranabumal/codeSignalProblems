package com.company;

public class ReverseInParentheses {
    public String reverseInParentheses(String inputString) {
        String parenthReversString="";
        String lowercase= inputString.toLowerCase();
        int count=0;
        boolean paranStart=false;
        for(int i=0;i<lowercase.length();i++ ){
            String val= String.valueOf(lowercase.charAt(i));
            String reversString="";

            if(val.equals("(")){
                paranStart=true;
                break;
            }
            if(paranStart){
                reversString=reversString+lowercase.charAt(i);
            }
        }
        return parenthReversString;
    }
}
