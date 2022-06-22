import java.util.Scanner;

public class Day06InterviewQuestions01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double a= input.nextDouble();

        System.out.println("Enter last number");
        double b = input.nextDouble();
        //1. way
       /* System.out.println(a + " - " + b ) ;
        double temp = 0;
        temp= b;
        b= a ;
        a=temp;
        System.out.println( a+ "- " + b ); */

        // 2. Way
        System.out.println(a + " - " + b ) ;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a + " - " + b ) ;

    }
}
