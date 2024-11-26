package com.ara.test;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        String s = "hii this is UsmaN";
        String r = "";
        boolean cN = true;

        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch==' '){
                r+=ch;
                cN=true;
            }else
                if (cN){
                    r+=Character.toUpperCase(ch);
                    cN=false;
                }
                else
                    r+=Character.toLowerCase(ch);
        }
        System.out.println("Title Case : " + r);
    }
}