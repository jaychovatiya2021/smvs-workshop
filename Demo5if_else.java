package org.example;

public class Demo5if_else {
    public static void main(String[] args) {
        long a, b, c, d, e;
        a = 100;
        b = 200;
        c = 300;
        d = 1400;
        e = 11000;
        if (a > b){
            if (a > c){
                if (a > d){
                    if (a > e)
                        System.out.println("Big no is a : " + a);
                    else
                        System.out.println("Big no is e : " + e);
                }
            }
        } else if (b > c){
            if (b > d){
                if (b > e)
                    System.out.println("Big no is b : " + b);
                else
                    System.out.println("Big no is e : " + e);
            }
        } else if (c > d){
            if (c > e)
                System.out.println("Big no is c : " + c);
            else
                System.out.println("Big no is e : " + e);

        }else
            if (d > e)
                System.out.println("Big no is d : " + d);
            else
                System.out.println("Big no is e : " + e);


    }
}
