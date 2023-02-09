package org.example;

public class Demo3if_else
{
    public static void main(String[] args) {
        long a,b,c;
        a = 10;
        b = 40;
        c = 30;
        if(a>b) {
            if (a > c)
                System.out.println("Big is a : " + a);
            else
                System.out.println("Big is c :  " + c);
        }else {
            if (b > c)
                System.out.println(" Big is  b: " + b);
            else
                System.out.println("Big is c : " + c);
        }
    }
}
