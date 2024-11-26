package com.bad.helper;

import java.sql.Struct;

public class SecurityManager {
    private static SecurityManager instance;
    private ThreadLocal<User> threadLocal;

    record User(String un, String pwd){}

    private SecurityManager(){
        threadLocal = new ThreadLocal<>();
    }

    public static SecurityManager getInstance(){
        if (instance==null)
            instance=new SecurityManager();
        return instance;
    }

    public void logIn(String un, String pwd){
        threadLocal.set(new User(un,pwd));
    }

    public void logOut(){
        threadLocal.set(null);
    }

    public boolean aunthenticate(){
        User user = null;
        user = threadLocal.get();
        if (user!=null){
            if (user.un().equals("John") && user.pwd().equals("aop@1"))
                return true;
        }
        return false;
    }

    public String getLoggedIn(){
        User user = null;
        user = threadLocal.get();
        if (user!=null){
            return user.un();
        }
        return null;
    }
}
