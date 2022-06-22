public class Day011ForLoop01 {

    public static void main(String[] args) {

        // Type code to find of integers from 10 to 14
        int sum=0; //

        for (int i=10; i<15; i++   ){
            sum =sum+i;
            System.out.println("The sum is "+sum);// if you put that inside the loop body
                                                 // you will see the sum value for every loop
                                                 // if you want to see the final sum value put it after the loop
        }


        // type code find multiple

        int mult=1;

        for (int i=10; i<15; i++   ){
            mult =mult*i;
        }
        System.out.println("The mult is "+mult);
}
}
