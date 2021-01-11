package com.company;

import java.util.Scanner;

public class Main {

    //komentar
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        char operator;
        double answer = 0.0;

        Scanner scanObject = new Scanner(System.in);
        System.out.println("Унесите први број: ");
        a = scanObject.nextInt();
        System.out.println("Унесите други број: ");
        b = scanObject.nextInt();
        System.out.println("Одаберите операцију: +, -, *, /");
        operator = scanObject.next().charAt(0);

        switch (operator) {
            case '+' -> answer = a + b;
            case '-' -> answer = a - b;
            case '*' -> answer = a * b;
            case '/' -> answer = a % b;
        }

        System.out.println(a + " " + operator + " " + b + " = " + answer);
    }
}