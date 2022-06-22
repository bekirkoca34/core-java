package firstWeek;

public class Day05Concatination {

    /*
    concatinatio: Joining Strings with each other or other data types
                  To do concatination we have two options;
                  1) use '+' sign
                  2) use 'concat'() method

     */

    public static void main(String[] args) {

         String s="Tom";
         String t="Hanks";
         int i=12;
         int k= 5;
         char c='A';

        System.out.println(s+t);
        System.out.println(s+" "+ t);
        System.out.println(s+i+k);// Tom125
        System.out.println(s+(i+k));//Tom17

        System.out.println(i+k+s);
        System.out.println(i+c);
    }
}
