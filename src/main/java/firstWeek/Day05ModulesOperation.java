package firstWeek;

import java.util.Scanner;

public class Day05ModulesOperation {

    /*
    Modules operator; % called 'modulos operotor' in Java
                       it return the remainder in a division opration
     */

    public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer ");
        int n= input.nextInt();

        int absN= Math.abs(n);

        // ask user enter an integer and print thefind the last digit of the integer on the console


        int lastDigit= absN%10;
        System.out.println(lastDigit);


        // ask user to eneter dob, then just last 2 digits on the ons

        int lastTwoDigit=absN %100;
        System.out.println(lastTwoDigit);


        // ask user to enter integer then check if the number is even


        System.out.println("is the number even? " + (absN % 2==0));

        // ask user to enter integer then check if the number is odd

        System.out.println("is the number odd? " + (absN % 2!=0));

        // ask user to enter a 3 digits integer the find the sum of digits

        int d1= absN%10;

        absN=absN/10;
        int d2=absN%10;

        absN=absN/10;
        int d3= absN %10;

        System.out.println(d1+d2+d3);




    }
}
