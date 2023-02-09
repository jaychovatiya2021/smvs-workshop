package org.example;

import java.util.Scanner;

//WAP to get the you name and print on Terminal using scanner

public class Scannerdemo1 {
    public static void main(String[] args) {

        System.out.println("Enter the name :");
        Scanner s = new Scanner(System.in);
        String name  = s.nextLine();
        System.out.println("enter the name is " + name);


    }
}
