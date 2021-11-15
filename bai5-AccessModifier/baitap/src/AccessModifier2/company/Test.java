package com.company;

public class Test {

    public static void main(String[] args) {
        Students student1 = new Students();
        System.out.println(student1.toString());
        student1.setName("Nam");
        student1.setClasses("C03");
        System.out.println(student1.toString());
    }
}
