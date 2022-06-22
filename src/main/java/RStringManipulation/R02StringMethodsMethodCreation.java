package RStringManipulation;

public class R02StringMethodsMethodCreation {
    public static void main(String[] args) {

        String str= " Java is Java ";
/*   trim()
is sed thr delete space character from the beginning and from the end of the string
 */
        System.out.println(str);   //" Java is Java " ===>14
        System.out.println(str.trim());  //"Java is Java" ===>12
        System.out.println(str.trim().length()); //12
/*
by using String methods change the String "  Ali123 can?!@  " to "Ali CAN"
 */
String n1 = "  Ali123 can?!@  ";
//1.Way
System.out.println(n1.replaceAll("\\W","").replace("123"," ").replace("can","CAN"));
//2.Way
        String f= n1.substring(2,5);
        String l=n1.substring(9,12).toUpperCase();
        System.out.println(f+" "+l);
        // concat()
        //is used to join Strings."+" and "concat() does the same.but i recommend to use "concat()" instead of "+"
        System.out.println(f.concat(" ").concat(l));
    //3.Way
        System.out.println(n1.trim().replaceAll("\\d","").replace("can?!@", "CAN"));
      /*  String str2="$12.99";
        String str3="$8.00";
        find the sum of str2 and str3
       */

        System.out.println("================");
        String str2="$12.99";
        String str3="$8.00";
        String s2=str2.replace("$", "").replace(".","");
        String s3=str3.replace("$","").replace(".","");
       String s22=str2.replaceAll("\\D","");
        System.out.println(s22);

        System.out.println(s2);
        System.out.println(s3);

        System.out.println((Integer.parseInt(s2) + Integer.parseInt(s3) )/100.0);
        System.out.println((Integer.valueOf(s2) + Integer.valueOf(s3) )/100.0);
    }
}
