import java.util.Scanner;

public class Day06Ternary {

    public static void main(String[] args) {

        // type code to check if a number is posotive or not

        int x=12;
        // 1 way; By using if-else
        if (x>0){
            System.out.println("positive");
        }else {
            System.out.println(" not positive");
        }

     // 2 second way By using ternary

        String result =x>0 ? "positive":" not positive";
        System.out.println(result);
        // type code to check if and integer has 3 digit or not
        // int y = 256;
        Scanner input= new Scanner(System.in);
        System.out.println( "Enter a digit"  );
        int y =input.nextInt();
        int absY=Math.abs(y);
        String result2 = absY>99  && absY<1000 ? " true ":"false";
        System.out.println( result2);





                //Type code to check if a number is positive or not
                int T = -12;
                //1.Way: By using if-else
                if(x>0){
                    System.out.println("Positive");
                }else{
                    System.out.println("Not positive");
                }

                //2.Way: By using ternary
                String result1 = x>0 ? "Positive" : "Not positive";
                System.out.println(result1);

                //Type code to check if an integer has 3 digits or not
                int k = 234;
                int absK = Math.abs(y);

                //Using '>' is better than using '>=' because there is single condition in the first
                String result3 = absY>99 && absY<1000 ? "It has 3 digits" : "It has no 3 digits";
                System.out.println(result2);

                //Type code to check following conditions for state abbreviations in the USA
                //1)It should have 2 characters     2)It should have just uppercase
                String s = "FLe";
                String result4 = s.length()==2 && s.replaceAll("[A-Z]", "").length()==0 ? "Valid abbreviation" : "Invalid abbreviation";
                System.out.println(result3);
            }
}



