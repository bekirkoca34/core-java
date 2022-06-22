package practice01;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class R01 {
    // get first name and last name from user then print in upper cases on the console with a space between them


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String fN = scan.next();
        System.out.println("Enter last name");
       String lN = scan.next();

        System.out.println(fN.toUpperCase() + " " + lN.toUpperCase() );
    }
}
