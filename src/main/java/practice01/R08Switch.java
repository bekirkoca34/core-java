package practice01;

import java.util.Scanner;

public class R08Switch {
    //Ask user to enter a character, if it is vowel letter print "Vowel", if it is not vowel print "Not vowel", if it is not letter
    // print "Enter a letter"

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter to check if it is vowel or not");
        char c= scan.next().toLowerCase().charAt(0);

switch(c){
    case 'a':
    case'e':
    case'i':
    case'o':
    case'u':
        System.out.println("Vowel");
        break;
    case'b':
    case'c':
    case'd':
    case'f':
    case 'g':
    case 'h':
    case'l':
    case'n':
    case'm':
    case 'j':
    case'k':
    case's':
    case'r':
    case'p':
    case'v':
    case'y':
    case'w':
    case'x':
    case'q':
    case't':
    case'z':
        System.out.println("Not Vowel");
        break;


        default:
        System.out.println("Enter a letter");






}

    }

}
