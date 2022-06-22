package firstWeek;

public class Day02MethodCreation {

    public static void main(String[] args) {

        System.out.println(addIntegers(12, 5) );
        System.out.println(multiplyIntegers(8,5) );
        System.out.println(subractIntegers(3 ,6));
        System.out.println(divisionIntegers(12 , 4));
        System.out.println(divideIntegers(3.25 , 0.2 ));

    }


    public static int addIntegers(int a , int b ){
        return a+b;
    }

    public static int multiplyIntegers(int a, int b) {
       return a * b ;
    }

    public static int subractIntegers(int a , int b){
        return a-b;
    }
    public static int divisionIntegers (int a , int b ){
        return a/b;
    }
    public static double divideIntegers( double a , double  b){
        return a/b ;
    }


}
