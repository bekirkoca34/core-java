package practice01;

import java.util.Scanner;

public class R04Switch {
    public static void main(String[] args) {
        //Ask user to enter one of the +, -, *, /, % operations.
        // Ask user to enter two values then return the result of the operation

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double n = input.nextDouble();
        System.out.println("Enter second number");
        double m = input.nextDouble();
        System.out.println("Enter one of the +,-,/,*,% operations");
        char opr = input.next().charAt(0);
 switch ( opr) {
     case '+':
         System.out.println(n+"+"+m+"="+(n+m));
         break;
     case '-':
         System.out.println(n+"-"+m+"="+(n-m));
         break;
     case '*':
         System.out.println(n+"*"+m+"="+(n*m));
         break;
     case '/':
         System.out.println(n+"/"+m+"="+(n/m));
         break;
     case '%':
         System.out.println(n+'%'+m+'='+(n%m));
     default:
         System.out.println("that operation is not defined");







 }

    }
}
