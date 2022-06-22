import java.util.Arrays;

public class Day12Arrays01 {

    public static void main(String[] args) {

        /* array is a container, we can put inside many values.
        1)Arrays are for storing multiple data.
        2)An array can have just a single data type
        3)Arrays can store just primitive data types or references of non-primitives
         An array can not have non-primitive data types in it.

         4) when you create an array you have to declare its length(number of elements in an array)

         */

        // how to create an Array
        int ages []= new int[4];

        // how to print an Array on the cconsole
        System.out.println(Arrays.toString(ages));// [0, 0, 0, 0]

        // how to assign values to array elements
        ages[0]=12;
        ages[1]=20;
        ages[2]=11;
        ages[3]=9;
        System.out.println(Arrays.toString(ages));// [12, 20, 11, 9]

        // how to print array elements one by one
        System.out.println(ages[2]);// 11

        // print the sum of the ages array elemets on the console
        //1.way
        System.out.println(ages[0]+ages[1]+ages[2]+ages[3]);// 52

        //2.way
        int sum=0;
        for ( int i=0; i<ages.length; i++  ){
            sum=sum+ages[i];
        }
        System.out.println(sum);

        // how to create an array and assign values in short way
        String names[]={"Tom", "Hanks","Alex","Karl"};
        System.out.println(Arrays.toString(names));//[Tom, Hanks, Alex, Karl]

// find the total number of charactes in array elements

        int total=0;
        for (int i=0;i< names.length; i++){

            total=total+names[i].length();

        }
        System.out.println(total);//16

    }

}
