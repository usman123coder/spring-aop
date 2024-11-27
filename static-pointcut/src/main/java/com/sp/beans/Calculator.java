package com.sp.beans;

public class Calculator {
    public int add(int a, int b){
        System.out.println("i am from add method target class");
        return a+b;
    }
    public int multiply(int a, int b){
        System.out.println("I am from multiply method from target class.");
        return a*b;
    }
}
