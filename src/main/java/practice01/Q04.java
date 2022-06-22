package practice01;

import java.util.Scanner;

public class Q04 {
    // type a code that calculates the hypotenus

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enterthe lenght of first leg of the right trangle");
        double a= input.nextDouble();

        System.out.println("Enterthe lenght of first leg of the left trangle");
        double b = input.nextDouble();

        double hyp = Math.sqrt((a*a)+(b*b));
        // double hyp = Math.sqrt(a*a + b*b);
        System.out.println("Hypotenuse: "+hyp);

        }
    }

