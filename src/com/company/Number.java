package com.company;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("First Number? :");
        num1 = keyboard.nextInt();

        System.out.println("Last Number?  :");
        num2 = keyboard.nextInt();

        System.out.printf("Sum of two integers:%d%n", num1 + num2);
        System.out.printf("Product of two integers:%d%n", num1 * num2);
        System.out.printf("Average of two integers:%.2f%n", (double) (num1 + num2) / 2);

        {
            if (num1 + num2 > 200) {
                System.out.println("Calculated sum is " + (num1 + num2) + "*");
            } else if (num1 + num2 > 1000) {
                System.out.println("Calculated sum is" + (num1 + num2) + "~");
            }

        }

    }
}