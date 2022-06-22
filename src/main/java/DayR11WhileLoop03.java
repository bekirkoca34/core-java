public class DayR11WhileLoop03 {
    public static void main(String[] args) {
// type code to print the sum of the digits of an integer


        int i= 237;
        int sum = 0;
while(i>0){
    sum=sum + i%10;
    i/=10;

    System.out.println(sum);
}





    }
}
