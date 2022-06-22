package RStringManipulation;

import java.util.Scanner;

public class RQ1 {
    /*
    ask user to enter one of the 'U' , 'S', and 'A'.
    then type a program by using switch statement to print
     "United" for u
     "States" for s
     "America" for a
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the one of the 'U' , 'S', and 'A'  ");
        char lt= scan.next().toUpperCase().charAt(0);

        switch ( lt){
            case 'U':
                System.out.println("United");
                break;
            case 'S':
                System.out.println("States");
                break;
            case 'A':
                System.out.println("America");
                break;
            default:
                System.out.println("Enter the valid letter");


        }


scan.close();


    }
}
