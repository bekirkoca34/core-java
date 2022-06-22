import java.util.Scanner;
// get first name and last name from user then print in upper cases on the console with a space between them



public class D04CalismaScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase());


    }
}




