package practice01;

import java.util.Scanner;

public class R03 {

    /* If the gender is "Male" and the age is less than 13 print "Boy" otherwise print "Man" on the console
        If the gender is "Female" and the age is less than 13 print "Girl" otherwise print "Woman" on the console
        If the gender is different from "Male" and "Female" print "No information" on the console
         */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR GENDER");
        String gender = scan.next().toUpperCase();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        int  absAge = Math.abs(age);

        if(gender.equals("MALE")){
            if(absAge<13){
                System.out.println("Boy");
            }else{
                System.out.println("Man");
            }
        }else if(gender.equals("FEMALE")){
            if(absAge<13){
                System.out.println("Girl");
            }else{
                System.out.println("Women");
            }
        }else{
            System.out.println("No Informatoin");
        }



    }
}
