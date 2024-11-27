package com.ta.beans;

public class Thrower {
    public  int willThrow(int i) throws IllegalAccessException {
        System.out.println("from Target class willThrow().");
        if (i<0)
            throw new IllegalAccessException("invalid i value");
        return i;

    }
}
