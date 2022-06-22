package firstWeek;

import java.util.Scanner;

public class Day05IfStatement {

    /*
    if your score less than 50 then you will fail

      if(condition){
             the code bloke
        }

        Note : we use "if statement "
     */

    public static void main(String[] args) {

        if(3<4){
            System.out.println("it is true");
        }


        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = input.nextInt();

        //type code to check if the integer got from user is divided by 3 or not

        if (n %3==0){
            System.out.println("The number is divided by 3");
        }

        if (n%3!=0){
            System.out.println("the number is not divided by 3");
        }

        // type code to check if the first digit of a 3 digits integer is less than 5.
        // if its less than 5 print 'perfect number' otherwise print 'good number'

        if(n/100<5){
            System.out.println("perfect number");
        }

        if (n/100>=5){
            System.out.println("good number");
        }

        System.out.println("Enter the initial of any day name");
        String s=input.next();

        if (s.equals("S")){
            System.out.println("Saturday and Sunday");
        }
        if (s.equals("T")){
            System.out.println("Tuesday and Thursday");
        }
        if (s.equals("W")){
            System.out.println("Wednesday");
        }
        if (s.equals("F")){
            System.out.println("Friday");
        }
        if (s.equals("M")){
            System.out.println("Monday");
        }
    }
}
