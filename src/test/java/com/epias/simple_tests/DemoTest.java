package com.epias.simple_tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class DemoTest {
    public static void main(String[] args) {
        System.out.println("hello world");
    }

    @Test
    public void test(){
        Assertions.assertEquals("2", "2");

    }
}