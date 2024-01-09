package Assignment;

// NAME: NUR AMIRA NABILA BINTI MOHD AB RAHMAN
// MATRIC NO : 2220682
import java.util.Scanner;
public class BankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingAccount savingAccount = new SavingAccount(1000.00, 0.0025);
        CheckingAccount checkingAccount = new CheckingAccount(1000.00, 10);

        int option;
        do {
            System.out.println("Bank Account");
            System.out.println("1. Saving");
            System.out.println("2. Checking");
            System.out.println("3. Exit");
            System.out.print("Choose your option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    savingAccount.handleAccountOperations();
                    break;
                case 2:
                    checkingAccount.handleAccountOperations();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

        } while (option != 3);
    }

}