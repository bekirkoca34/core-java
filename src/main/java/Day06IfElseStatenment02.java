import java.util.Scanner;

public class Day06IfElseStatenment02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");
        String pwd = input.next();

        // ask user the enter passsword thwn check if the password is valid or not acoeding to the given rules
        //1) at least 8 charters
        // 2))cointains at least 1 uppercases
        // 3))cointains at least 1 lover case
        // 4))contains at least 1 symbol(diffrent of letters and digit)

        if (pwd.length() < 8) {
            System.out.println("password is invalid because it does not have at least 8 characters");
        } else if ((pwd.replaceAll("[^A-Z]", "")).length() == 0) {
            System.out.println("password is invalid because it does not have at least one uppercase");
        } else if ((pwd.replaceAll("[^a-z]", "")).length() == 0) {
            System.out.println("password is invalid because it does not have at least one lovercase");
        }else if((pwd.replaceAll("[A-Za-z0-9]","")).length()==0){
            System.out.println("Password is invalid because it does not have any symbol");

        }else {
            System.out.println("Pasword is valid, Welcome to Chase Bank");
        }

        System.out.println("================================");
//2WAY:
        if (pwd.length() < 8) {
            System.out.println("password is invalid because it does not have at least 8 characters");
        }
        if ((pwd.replaceAll("[^A-Z]", "")).length() == 0) {
            System.out.println("password is invalid because it does not have at least one uppercase");
        }
        if ((pwd.replaceAll("[^a-z]", "")).length() == 0) {
            System.out.println("password is invalid because it does not have at least one lovercase");
        }
        if((pwd.replaceAll("[A-Za-z0-9]","")).length()==0){
            System.out.println("Password is invalid because it does not have any symbol");

        }

    }

}
