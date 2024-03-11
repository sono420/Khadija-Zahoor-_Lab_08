import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test 1: SSN pattern
        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssn = SafeInput.getRegExString(scanner, "Enter SSN (###-##-####)", ssnPattern);
        System.out.println("SSN entered: " + ssn);

        // Test 2: UC Student M number pattern
        String studentNumberPattern = "^(M|m)\\d{5}$";
        String studentNumber = SafeInput.getRegExString(scanner, "Enter UC Student M number (M#####)", studentNumberPattern);
        System.out.println("UC Student M number entered: " + studentNumber);

        // Test 3: Menu choice pattern
        String menuChoicePattern = "^[OoSsVvQq]$";
        String menuChoice = SafeInput.getRegExString(scanner, "Enter menu choice (OoSsVvQq)", menuChoicePattern);
        System.out.println("Menu choice entered: " + menuChoice);

        // Close the scanner
        scanner.close();
    }
}


