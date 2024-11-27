package com.dp.beans;

public class Calculator {
    public int add(int a, int b){
        System.out.println("add method target");
        return a+b;
    }
    public int multiply(int a, int b){
        System.out.println("multiply method target");
        return a*b;
    }
}
