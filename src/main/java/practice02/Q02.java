package practice02;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {


//Ask user to enter first name,
// middle name and last name as one single String,
// then print the first character of middle name and last name.
// e.g. Mark Hansel Twain==> HT
        Scanner input =new Scanner(System.in);
        System.out.println("enter first name,middle name and last name " );
        String str= input.nextLine().trim().toUpperCase();
         char initialOfMiddle=str.charAt(str.indexOf(" ")+1 );
        System.out.println(initialOfMiddle);
        char initialOfLastname =str.charAt(str.lastIndexOf(" ")+1);
        System.out.println(initialOfLastname );
        System.out.println(""+ initialOfMiddle+initialOfLastname);









    }
}
