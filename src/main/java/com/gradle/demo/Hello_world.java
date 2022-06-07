package com.gradle.demo;

public class Hello_world {
    String getGreeting() {
        return "Hello, World!";
    }
    public static void main (String args[]){
        Hello_world obj=new Hello_world();
        System.out.println(obj.getGreeting());
    }
}
