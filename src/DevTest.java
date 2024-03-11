//import java.util.Scanner;

//public class DevTest {
   // public static void main(String[] args) {
        // Create a Scanner for input
      //  Scanner scanner = new Scanner(System.in);

        // getNonZeroLenString for Program 01
       // String firstName = SafeInput.getNonZeroLenString(scanner, "Enter your first name");
      //  String lastName = SafeInput.getNonZeroLenString(scanner, "Enter your last name");

        // Display the full name
       // System.out.println("\nYour full name is: " + firstName + " " + lastName);

        // Close the Scanner
       // scanner.close();
   // }//
//}//

                        // Program-2 Favorite Numbers
//import java.util.Scanner;

//public class DevTest {
    //public static void main(String[] args) {
        // Create a Scanner for input
       // Scanner scanner = new Scanner(System.in);
// Test getInt and getDouble methods
       // int testInt = SafeInput.getInt(scanner, "Enter an integer");
        //System.out.println("Entered integer: " + testInt);

        //double testDouble = SafeInput.getDouble(scanner, "Enter a double");
        //System.out.println("Entered double: " + testDouble);

        // Close the Scanner
        //scanner.close();
    //}
//}
                    ///program 03 Date and Time of Birth
//import java.util.Scanner;

//public class DevTest {
    //public static void main(String[] args) {
        // Create a Scanner for input
      //  Scanner scanner = new Scanner(System.in);

        // Test Program 03: Date and Time of Birth
      //  int birthYear = SafeInput.getRangedInt(scanner, "Enter your birth year (1950-2015):", 1950, 2015);
     //   int birthMonth = SafeInput.getRangedInt(scanner, "Enter your birth month (1-12):", 1, 12);

        // Use switch to validate the number of days based on the month
       // int daysInMonth;
        //switch (birthMonth) {
           // case 2:
                // Assuming a non-leap year for simplicity
               // daysInMonth = 28;
               // break;
          //  case 4:
            //case 6:
          //  case 9:
         //   case 11:
               // daysInMonth = 30;
              //  break;
           // default:
              //  daysInMonth = 31;
            //    break;
      //  }

      //  int birthDay = SafeInput.getRangedInt(scanner, "Enter your birth day (1-" + daysInMonth + "):", 1, daysInMonth);
      //  int birthHour = SafeInput.getRangedInt(scanner, "Enter your birth hour (1-24):", 1, 24);
      //  int birthMinute = SafeInput.getRangedInt(scanner, "Enter your birth minute (1-59):", 1, 59);

       // System.out.println("Your birth details: " + birthYear + "/" + birthMonth + "/" + birthDay +
            //    " " + birthHour + ":" + birthMinute);

        // Close the Scanner
        //scanner.close();
    //}
//}//*

                // program-4 Check Out at the 10$ Store

//import java.util.Scanner;

//public class DevTest {
   // public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);

        // Test getRangedDouble
        //double price = SafeInput.getRangedDouble(scanner, "Enter the price of the item", 0.5, 10.0);
      //  System.out.println("Item price: $" + price);

        // Close the scanner
        //scanner.close();
    //}
//}

// program-5
//public static String getRegExString(Scanner pipe, String prompt, String regEx) {
  //  String userInput;
   // do {
     //   System.out.print("\n" + prompt + ": ");
      //  userInput = pipe.nextLine();
   // } while (!userInput.matches(regEx));

  //  return userInput;
//}
//}

//import java.util.Scanner;

//public class DevTest {
    //public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);
        // Run 1: Valid SSN pattern
      //  String validSSN = SafeInput.getRegExString(scanner, "Enter SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
      //  System.out.println("SSN entered: " + validSSN);

// Run 2: Valid UC Student M number pattern
       // String validStudentNumber = SafeInput.getRegExString(scanner, "Enter UC Student M number (M#####)", "^(M|m)\\d{5}$");
       // System.out.println("UC Student M number entered: " + validStudentNumber);

// Run 3: Valid Menu choice pattern
       // String validMenuChoice = SafeInput.getRegExString(scanner, "Enter menu choice (OoSsVvQq)", "^[OoSsVvQq]$");
       // System.out.println("Menu choice entered: " + validMenuChoice);

// Run 4: Invalid SSN pattern
        //String invalidSSN = SafeInput.getRegExString(scanner, "Enter SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
       // System.out.println("Invalid SSN entered: " + invalidSSN);

// Run 5: Invalid UC Student M number pattern
      //  String invalidStudentNumber = SafeInput.getRegExString(scanner, "Enter UC Student M number (M#####)", "^(M|m)\\d{5}$");
      //  System.out.println("Invalid UC Student M number entered: " + invalidStudentNumber);

// Run 6: Invalid Menu choice pattern
        //String invalidMenuChoice = SafeInput.getRegExString(scanner, "Enter menu choice (OoSsVvQq)", "^[OoSsVvQq]$");
      ////  System.out.println("Invalid Menu choice entered: " + invalidMenuChoice);
   // }
//}

// DevTest for Part H (PrettyHeader)
public class DevTest {
    public static void main(String[] args) {
        // DevTest for Part H
        // You can manually inspect the output to ensure that the prettyHeader method works as expected
        SafeInput.prettyHeader("DevTest for PrettyHeader");

        // End of Part H DevTest

        // Closing message for the DevTest
        SafeInput.prettyHeader("DevTest completed successfully!");
    }
}
