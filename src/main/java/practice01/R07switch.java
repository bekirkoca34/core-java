package practice01;

import java.util.Scanner;

//Ask user to enter day number, print all day names starting with the given day name
// User ==> 5          Output ==> Thursday - Friday - Saturday
// User ==> 3          Output ==> Tuesday - Wednesday - Thursday - Friday - Saturday
public class R07switch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day number");
         int dayNum= scan.nextInt();

         switch(dayNum){
             case 1:
                 System.out.println("Sunday");
             case 2:
                 System.out.println("Monday");
             case 3:
                 System.out.println("Tuesday");
             case 4:
                 System.out.println("Wednesday");
             case 5:
                 System.out.println("Thursday");
             case 6:
                 System.out.println("Friday");
             case 7:
                 System.out.println("Saturday");
                 break;
             default:
                 System.out.println("Please Enter A Valid Day ");



         }









    }

}
