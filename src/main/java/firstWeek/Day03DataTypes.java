package firstWeek;

public class Day03DataTypes {
/*
type casting: Converting  number primitive data type to another number primitive data type

byte  -  short  -  int  - long  - float   -  double
note: if you  convert small data types to large data types , it is called "Auto Widening "



 */


    public static void main(String[] args) {

        // Auto Widening
        byte age = 12;

        int myAge = age;

        short populationOfAVillage = 21000;
         double myPopulationAVillage = populationOfAVillage;

       //Explicit Narrowing
         double x = 23.45 ;
         long y = (long)x;





    }
}
