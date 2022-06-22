package practice01;

import java.util.Scanner;

public class R13Ifelse {
    public static void main(String[] args) {
        /*
        If the score is less than 50 then you will fail
        If the score is greater than or equal to 50 then you will pass
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the score");
        int s = scan.nextInt();
          //  int absS=Math.abs(s);
        if (s < 50) {
            System.out.println("You will fail");
        } else {
            System.out.println("You will Pass");
        }

    }


}


