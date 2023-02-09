package org.example;


    import java.util.Scanner;

    public class SwitchDemo {

        public static void main(String[] args) {

            int value,a,b;
            System.out.println("Calculation Details");
            System.out.println("**************************");
            System.out.println("0 : Addition");
            System.out.println("1 : Sub");
            System.out.println("2 : Multiplication");
            System.out.println("3 : Divide");
            System.out.println("4 : Modulo");
            System.out.println("**************************");
            System.out.println("Enter the value : ");
            Scanner s = new Scanner(System.in);
            value = s.nextInt();

            switch(value)
            {
                case 0:
                   // System.out.println("Increment");
                    System.out.println("Enter the value of a: ");
                    a = s.nextInt();
                    System.out.println("Enter the value of b: ");
                    b = s.nextInt();
                    System.out.println("Increment is  : "+(a+b));

                    break;
                case 1:
                    //System.out.println("Sub");
                    System.out.println("Enter the value of a: ");
                    a = s.nextInt();
                    System.out.println("Enter the value of b: ");
                    b = s.nextInt();
                    System.out.println("Sub is  : "+(a-b));
                    break;
                case 2:
                   // System.out.println("Mul");
                    System.out.println("Enter the value of a: ");
                    a = s.nextInt();
                    System.out.println("Enter the value of b: ");
                    b = s.nextInt();
                    System.out.println("Mul is  : "+(a*b));

                    break;
                case 3:
                    //System.out.println("divide");
                    System.out.println("Enter the value of a: ");
                    a = s.nextInt();
                    System.out.println("Enter the value of b: ");
                    b = s.nextInt();
                    System.out.println("Div is  : "+(a / b));
                    break;
                case 4:
                   // System.out.println("Mod");
                    System.out.println("Enter the value of a: ");
                    a = s.nextInt();
                    System.out.println("Enter the value of b: ");
                    b = s.nextInt();
                    System.out.println("Div is  : "+(a % b));
                    break;
                default:
                    System.out.println("Invalid input..");
                    break;
            }
        }
    }

