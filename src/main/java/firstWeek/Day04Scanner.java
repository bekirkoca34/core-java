package firstWeek;

import java.util.Scanner;

public class Day04Scanner {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("please give the width  ");
        double width=input.nextDouble();
        System.out.println("please enter the length ");
        double legth= input.nextDouble();
        System.out.println(" please enter heigth");
        double height=input.nextDouble();
        System.out.println(" volume "+ width*legth*height);

    }
}
