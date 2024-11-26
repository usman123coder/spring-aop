package com.ara.beans;

import java.security.SecureRandom;
import java.util.List;

public class BillManager {
    public double generateBill(List<String> products){
        System.out.println("genereating bill");
        return new SecureRandom().nextDouble(20000);
    }
}
