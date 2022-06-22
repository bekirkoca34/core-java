package RStringManipulation;

import java.util.Scanner;

public class RForLoopK {
    public static void main(String[] args) {
//printEvenInt1();
//printEvenInt2();
//printDivisible5();
        PrintStrInRevOrder();
     }
    //even numbers from 100 to 23
    public static void printEvenInt1 (){

        for (int i =100 ; i>22 ;i=i-2){
            System.out.print(i + " ");
        }
    }

    public static void printEvenInt2(){
      for (int i=100;i>22;i--){
          if(i%2==0){
              System.out.print(i+ " ");
          }
      }

    }
// All integers divisible by 5 from 100 to 23


   public static void printDivisible5(){

        for(int i=100 ; i>22; i--) {
            if(i%5==0){
                System.out.print(i +" ");
            }
        }
}
 //Germany==>ynamreG

    public static void PrintStrInRevOrder(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a String to see it in reverse order");

        String str =scan.nextLine();

         for(int i =str.length()-1 ;i>=0 ;i--)
         {

           System.out.print(str.charAt(i));
       }

    }
}
