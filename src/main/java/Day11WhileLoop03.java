public class Day11WhileLoop03 {

    public static void main(String[] args) {

        // Type code to print sum of the digits of an integer
        int i=237;

        int sum=0;
        while(i>0){
           sum= sum + i%10;
            i/=10;
        }
        System.out.println(sum);

        // type code to create multiplication table for any given number
        // 3x1=3,3x2=6, 3x3=9 ...3x9=27 3x10=30

        int k=3;

        int m=1;
        while (m<11){
            System.out.println(k+ "x"+m + "=" + k*m);
            m++;
        }
    }
}