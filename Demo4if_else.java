package org.example;

public class Demo4if_else {
    public static void main(String[] args) {
        long a, b, c, d;
        a = 107;
        b = 4770;
        c = 990;
        d = 8000;
        if (a > b) {
            if (a > c) {
                if (a > d)
                    System.out.println("Big no is a : " + a);
                else
                    System.out.println("Big no is d : " + d);
            }
        } else if (b > c) {
            if (b > d)
                System.out.println("Big no is b : " + b);
            else
                System.out.println("Big no is d :" + d);
        } else
        if (c > d)
            System.out.println("Big no is c : " + c);
        else
            System.out.println("Big no is d : " + d);

    }
}
