package org.example;


    import java.util.Scanner;

    // WAP get the 2 long value from user and sum it /
    public class ScannerDemo {

        public static void main(String[] args) {

            int a,b;
            System.out.println("Enter the value of a : ");
            Scanner s = new Scanner(System.in);
            a = s.nextInt();
            System.out.println("Enter the value of b: ");
            b = s.nextInt();
            System.out.println("Total is  : "+(a+b));

        }
    }


