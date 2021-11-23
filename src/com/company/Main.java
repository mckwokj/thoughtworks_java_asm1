package com.company;

import model.Student;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student("Jack", 35, "male", 12345678);
        System.out.println(student1.getAge());
        System.out.println(student1.getGender());
        System.out.println(student1.getName());
        System.out.println(student1.getId());
    }
}
