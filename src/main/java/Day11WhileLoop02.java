public class Day11WhileLoop02 {

    public static void main(String[] args) {

        // Type code to check if a given integer is palindrome or not
        // palindrome:121<==>121

        int i=1215;
        String is=String.valueOf(i); // we want to use String methods for this reason we change data type

        int k=is.length()-1;// k=3
        String reversed="";

        while (k>=0){
            reversed=reversed + is.charAt(k);

            k--;
        }
        System.out.println(reversed);

        if (is.equals(reversed)) {

            System.out.println("this is palindrome");
        }else {
            System.out.println("this is not palindrome");
        }




    }
}
