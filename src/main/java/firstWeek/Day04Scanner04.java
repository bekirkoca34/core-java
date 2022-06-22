package firstWeek;

import java.util.Scanner;

public class Day04Scanner04 {

    public static void main(String[] args) {



        Scanner input=new Scanner(System.in);
        System.out.println("please enter first name  ");
        String fName= input.next().toUpperCase();
        System.out.println("please enter Lastname");
        String lName=input.next().toUpperCase();
        System.out.println(fName + " "+lName);

    }
}
