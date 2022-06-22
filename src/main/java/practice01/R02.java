package practice01;

public class R02 {
     /*Type java code by using nested ternary.
                Write a program to check if a year is leap year or not.
                If the year is divisible by 100 then it must be divisible by 400.
                If a year is not divisible by 100 then it must be divisible by 4.

         */


    public static void main(String[] args) {

        int x = 1996;
       // System.out.println(x % 100 == 0 ? (x % 400 == 0 ? "Laep year" : "not leap year") : (x % 4 == 0 ? "Laep year" : "not leap year"));


        if (x % 100 == 0) {
            if (x % 400 == 0) {

                System.out.println("LEAP YEAR");
            } else {

                System.out.println("Not Leap Year");
            }

        }else if (x%100!=0){
            if (x%4==0){
                System.out.println("LEAP YEAR");
            } else {

                System.out.println("Not Leap Year");

            }
        }

    }
}