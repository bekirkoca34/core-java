package practice01;

import java.util.Scanner;

public class R05ElseIf {

    public static void main(String[] args) {


        // ask user to enter the month name then print the month number

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the month Name");
        String month= scan.next();


        if(month.equalsIgnoreCase("January")){
            System.out.println(1);
        }else if(month.equalsIgnoreCase("February")){
            System.out.println(2);
        }else if(month.equalsIgnoreCase("March")){
            System.out.println(3);
        }else if(month.equalsIgnoreCase("April")){
            System.out.println(4);
        }else if(month.equalsIgnoreCase("May")){
            System.out.println(5);
        }else if(month.equalsIgnoreCase("June")){
            System.out.println(6);
        }else if(month.equalsIgnoreCase("July")){
            System.out.println(7);
        }else if(month.equalsIgnoreCase("August")){
            System.out.println(8);
        }else if(month.equalsIgnoreCase("September")){
            System.out.println(9);
        }else if(month.equalsIgnoreCase("October")){
            System.out.println(10);
        }else if(month.equalsIgnoreCase("November")){
            System.out.println(11);
        }else if(month.equalsIgnoreCase("December")){
            System.out.println(12);
        }else{
            System.out.println("Please enter a valid month name");
        }
    }
    }


