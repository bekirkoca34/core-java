package RStringManipulation;

import java.util.Scanner;

public class RForLoopK2 {
    public static void main(String[] args) {
        checkPalindrome();
    }


//palindromeaba

//ask user enter a string
  public static void checkPalindrome() {
       Scanner scan=new Scanner(System.in);
      System.out.println("enter a String to see if it is palindrome or not");
        String str=scan.nextLine();
        String revStr="";
        for(int i=str.length()-1;i>=0;i--){
            revStr=revStr + str.substring(i,i+1);

        }
      if (str.equals(revStr)) {
          System.out.println("yes");
      }else{
          System.out.println("no");
      }



  }


  }





