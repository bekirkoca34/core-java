public class DayR11WhileForLoop02 {
    public static void main(String[] args) {

        //palindrome number check with code
        int i = 12545;
        System.out.println(i);
        String strI = String.valueOf(i);
        String reverse = "";
        int idx = strI.length() - 1;

        while (idx > -1) {
            reverse = reverse + strI.charAt(idx);

            idx--;
        }
        System.out.println(reverse);
        if (strI.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
