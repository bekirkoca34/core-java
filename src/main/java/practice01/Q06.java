package practice01;

import java.util.Scanner;

public class Q06 {
   /* Ask user to enter a character and check if it is a letter.
    If it is not a letter print "Not Letter" on console.
    If it is letter check if it is lowercase or uppercase letter.
    If it is lowercase print "Lowercase Letter", if it is uppercase letter print "Uppercase Letter" on console.
            */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        char x= scan.next().charAt(0);

        System.out.println(x>='A' && x<='Z'|| x>='a' && x<='z'  ? x>='A' && x<='Z' ? "Uppercase": "Lower case": "Not Letter");

    }
}
