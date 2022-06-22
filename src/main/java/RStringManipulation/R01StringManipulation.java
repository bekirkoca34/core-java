package RStringManipulation;

import java.util.Scanner;

public class R01StringManipulation {
    public static void main(String[] args) {
 // indexOf()

        String str= "Java is easy if you study";
        System.out.println(str.indexOf("i")); // 5
      // if the character does not exist in the string, it returns "-1"
        System.out.println(str.indexOf("x")); // -1
        System.out.println(str.indexOf("I")); // -1
      //if you use multiple characters in indexOf(), it returns the index of first character
        System.out.println(str.indexOf("easy")); // 8
        System.out.println(str.indexOf('i',8)); //13
       //if you use indexOf() with the 2 parameters, Java looks for the character after given index.
        //second parameter is inclusive
        System.out.println(str.indexOf('e', 8));// 8


        /* ask user to enter a String and a character , then check if the String has the character or not

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a string the enter a character");
        String s= scan.nextLine();
        char ch= scan.next().charAt(0);
        String result=s.indexOf(ch)==-1 ? "The String has not character" : "the String has a character";
        System.out.println(result);

         */
//lastIndexOf()
String t= "Java ah Java!";

        System.out.println( t.lastIndexOf('a'));   //11
        System.out.println( t.lastIndexOf("a"));
        System.out.println( t.lastIndexOf("w")); // -1
        System.out.println( t.lastIndexOf("Java")); //8
        System.out.println( t.lastIndexOf("J",5)); //0
        System.out.println( t.lastIndexOf("v",5));  // 2
        System.out.println( t.lastIndexOf("h", 5)); //-1

        //contains()
        /*
        contains () is used to check if a single character or multiple characters exist in a String
        contains () method returns boolen
        contains () method cannot be used with chars, you have to use Strings
         */
     String r = "Learn Java, earn money";
        System.out.println( r.contains("e") );   // true
        System.out.println( r.contains("x") );  // false
        System.out.println( r.contains("earn") ); //true




        // Ask user to give you a string and a character
        // if the character does not exist in the string or exists just once print "not good"
        //if the character is used multiple times print "wooow!".

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a string the enter a character");
        String s= scan.nextLine();
        char ch= scan.next().charAt(0);
if (s.indexOf(ch)==-1 || s.indexOf(ch)==s.lastIndexOf(ch) ) {
    System.out.println(" Not good!");
}else {
    System.out.println("woow");}
    /* else in yerine yazilablr
      if(s.indexOf(ch) !=s.lastIndexOf(ch)){
        System.out.println("woow");

     */
    }
}

