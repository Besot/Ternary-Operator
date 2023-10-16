package com.besot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");

        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        String name = scan1.nextLine();
        System.out.println();
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.println("Welcome, " + name+"!");
        boolean condition = age < 18;
        boolean condition2 = age < 21;
        boolean condition3 = age < 50;
        String alcoholPurchase = condition ? "You are " + age + "years old, you are not allowed to order alcohol from our store!" :(condition2? "You can only order two alcoholic drinks per week!":(condition3? "You can order any alcoholic drink, but drink responsibly!":"You are "+age+"years old, a senior citizen, we advice you reduce alcohol consumption, check out our fruit wines, they are beneficial to your health."));
        System.out.println( alcoholPurchase);


    }
}