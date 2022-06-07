package com.gradle.demo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Hello_worldTest {
    @Test
    public void Hello_worldTest1(){
        Hello_world ob;
        ob = new Hello_world();
        Assertions.assertEquals("Hello, World!",ob.getGreeting());
    }

}