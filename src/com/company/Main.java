package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(student(7, 10));
        System.out.println(student(15, -30));
        System.out.println(student(22, 10));
        System.out.println(student(43, 50));
        System.out.println(student(7, 10));

        System.out.println("age = " + generateRandomAge());
    }

    public static String student(int age, int temperature) {
        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)) {
            System.out.println("Можно идти гулять");

        } else if ((age < 20) && (temperature >= 0 && temperature < 28)) {
            System.out.println("Можно идти гулять");
        } else if ((age < 45) && (temperature > -10 && temperature < 25)) {
            System.out.println("Можно идти гулять");

        } else {
            System.out.println("Оставайтесь дома");
        }
        return "age = " + age + "temperature = " + temperature;


    }

    public static int generateRandomAge() {
        Random random = new Random();
        int age = random.nextInt(100);
        return age;
    }
}

