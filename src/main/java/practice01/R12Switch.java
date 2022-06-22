package practice01;

import java.util.Scanner;

public class R12Switch {
    //Ask user to enter one of the +, -, *, /, % operation.
    //Ask user to enter two values then return the result of the operation

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter one of the operation signs: +, -, *, /, % ");
        char opr = scan.next().charAt(0);
        System.out.println("Enter first number");
        double num1 = scan.nextDouble();
        System.out.println("Enter second number");
        double num2 = scan.nextDouble();

        switch (opr) {
            case '+':
                System.out.println("Result: " + num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + num1 + "*" + num2 + "=" + (num1 * num2));
                break;
            case '/':
                System.out.println("Result: " + num1 + "/" + num2 + "=" + (num1 / num2));
                break;
            case '%':
                System.out.println("Result: " + num1 + "%" + num2 + "=" + (num1 % num2));
                break;
            default:
                System.out.println("Enter a valid operation please");


        }


    }

}
