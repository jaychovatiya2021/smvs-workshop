package org.example;

public class Demo6_if_else {
    public static void main(String[] args) {
        long a, b, c, d, e, f;
        a = 1000;
        b = 2000;
        c = 3000;
        d = 4000;
        e = 5000;
        f = 6000;
        if (a > b){
            if (a > c){
                if (a > d){
                    if (a > e){
                        if (a > f)
                            System.out.println("Big no is a : " + a);
                        else
                            System.out.println("Big no is f : " + f);
                    }
                }
            }
        }else if (b > c){
            if (b > d){
                if (b > e){
                    if (b > f)
                        System.out.println("Big no is b : " + b);
                    else
                        System.out.println("Big no is f : " + f);
                }
            }
        } else if (c > d){
            if (c > e){
                if (c > f)
                    System.out.println("Big no is c : " + c);
                else
                    System.out.println("Big no is f : " + f);
            }
        } else if (d > e){
            if (d > f)
                System.out.println("Big no is d : " + d);
            else
                System.out.println("Big no is f : " + f);
        } else
            if (e > f)
                System.out.println("Big no is e : " + e);
            else
                System.out.println("Big no is f : " + f);
    }



}
