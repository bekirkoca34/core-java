import org.codehaus.jackson.JsonToken;

import java.util.Locale;
import java.util.Scanner;

public class R01StringManipulation01 {
    public static void main(String[] args) {
        //endsWith()
        // is used to check the last character/s in a string.
        //endWith() is used with String do not use it with chars.
        //endWith() can be used with multiple characters as well.
        //endWith() return boolean.
        String str = "Java is Java";
        System.out.println(str.endsWith("a")); // true
        System.out.println(str.endsWith("x")); // false
        System.out.println(str.endsWith("ava")); // true

        //starsWith()
        // is used to check the first character/s in a string.
        //  starsWith()is used with String do not use it with chars.
        // starsWith() can be used with multiple characters as well.
        //starsWith()  return boolean.

        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Java"));//t
        System.out.println(str.startsWith("j")); // f
//if you want to check the character in a specific index do the following
        System.out.println(str.startsWith("i", 5)); //t

        System.out.println(str.startsWith("is", 5)); //t

//isEmpty()
// is used to check if a string has zero character
// if a string has no any character isEmpty() return "true" , otherwise returns "false"
        System.out.println(str.isEmpty());

        String str2 = "";
        System.out.println(str2.isEmpty()); // true

        //replace ()
        // is used to change that specific character/s to another one

        System.out.println(str.replace("a", "x"));
        System.out.println(str);
        System.out.println(str.replace("ava", "x"));
       System.out.println(str.replace("a", "xxxxxx"));
        System.out.println(str.replace("a", "")); // all "a" was deleted
// replace() method can be used to delete character/s
        System.out.println(str.replace('a' ,'x'));
// in replace() method char and String both can be used

        //////
        //replaceALL
        /*does the same with the replace().
        ==>>but there some diffrences 1)in replaceAll() you can not use chars', in replace () you can
                                  2)in replaceAll() you can use "Regular Expression"s
         */
        System.out.println(str.replaceAll("a","x"));

           String str3="Java123 learn, earn_money!! .";
/* Regular Expressions===> 1)\\s:space character
                           2)\\S: all characters except space character( it does not touch the space character
                           3)\\w:a-->z ,  A--Z  , _  ,0-->9
                           4)\\W: All characters except a-->z ,  A--Z  , _  ,0-->9
                           5)\\d:0-->9  digits
                           6)\\D: All characters except 0-->9
 */

        System.out.println( str3.replaceAll("\\s","*"));
      //  System.out.println( str3.replaceAll(" ","*")); ayni sonucu veriyor " "==== \\s
        System.out.println( str3.replaceAll("\\S","*"));
        System.out.println( str3.replaceAll("\\w","*"));
        System.out.println( str3.replaceAll("\\W","&"));
        System.out.println( str3.replaceAll("\\d","@"));
        System.out.println( str3.replaceAll("\\D","+"));

        //replaceFirst()
       // changes just the first occurrence of the character

        System.out.println(  str3.replaceFirst("a","*"));

//substring()
        /* is used to get apart of the string by using indexes

         */
        String str4= "Java is the best";
        System.out.println((str4.substring(3))); // a is the best
        System.out.println((str4.substring(7))); // the best (with space)
        System.out.println((str4.substring(0)));
       // System.out.println((str4.substring(0)));  System.out.println(str4); are same
        System.out.println((str4.substring(15))); //t
//if you use last index it returns last character because indexes used in substring() are inclusive
        System.out.println((str4.substring(16)));
// if you use lenght() in substring method it returns nothing
      //  System.out.println((str4.substring(17))); //error
//if you use any index greater than lenght , it retun "StringIndexOutOfBoundsException"

/* ask user enter a string
if the fisrt and last character of the string are same print "Wooow" otherwise, print "hmmm" on the consol
 */

     /*   Scanner scan =new Scanner(System.in);
        System.out.println("Enter a string");
String s=scan.nextLine();
String last=s.substring(s.length()-1);
// length() - 1 :everytime gives you last index
String first= s.substring(0,1);
// substring() method can be used two paramater. first paramater is starting index(inclusive), second parameter is ending index(exclusive)
        System.out.println(last);
        System.out.println(first);
if (first.equals(last)){
    System.out.println("Wooow");
}else{
    System.out.println("hmmmm");

      */

        String str5= "Java is an OOP language";
        System.out.println( str5.substring(5,14));
        System.out.println( str5.substring(2,3)); // v
        System.out.println( str5.substring(2,2)); // nothing
    // if starting and ending indexes are same you get nothing
        System.out.println( str5.substring(3,2));//Error
     //  in substring (), starting index cannot be larger than ending index.
        //if you do it you get"StringIndexOutOfBoundsException: begin 3, end 2, length 23"

        /*
        when we type codes we may get two types error msj
        1) while you type code you may get "red underline" this type of error is called "Compile Time Error"
        2) while you type code you do not  get "red underline", but after you run the code you will get some
        red messages on the console.that kind of errors are called "Run time Error"
         */

    }

}
