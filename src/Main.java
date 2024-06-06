import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //Initializing client data (Name, cpf, account number, balance)
       /* System.out.print("Type your name: ");
        String name = scanner.nextLine();
        System.out.print("Type your CPF (only numbers): ");
        Double cpf = scanner.nextDouble();
        System.out.print("Type your account number (only numbers): ");
        int account = scanner.nextInt();
        Double balance = 5500.00;*/

        String name = "Maria Linda ";
        int cpf = 12345678;
        int account = 123456;
        double balance = 5500.00;


        System.out.println("******************************************");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("Account number: " + account);
        System.out.printf("Balance: R$ %.2f%n", balance);
        System.out.println();
        System.out.println("******************************************");
        System.out.println();

        //Option Menu
        System.out.println("OPTIONS MENU");
        System.out.println();
        System.out.println("1 - Balance;");
        System.out.println("2 - Send money;");
        System.out.println("3 - Receive money;");
        System.out.println("4 - Exit;");
        System.out.println();

        System.out.print("Choose one option: ");
        int option = scanner.nextInt();

        //Balance view

        while (option != 4) {

            if (option == 1) {
                System.out.printf("Balance: R$ %.2f%n", balance);
            }else if (option == 2) {
                System.out.print("How much money would you like to send? ");
                double sendValue = scanner.nextDouble();

                if (balance < sendValue) {
                    System.out.printf("Insufficient money! Your balance is: R$ %.2f%n ", balance);
                }else {
                    balance -=  sendValue;
                    System.out.printf("New balance: R$ %.2f%n" , balance);
                }
            }else if (option == 3) {
                System.out.print("How much money would you like to deposit? ");
                double depositValue = scanner.nextDouble();
                balance +=  depositValue;
                System.out.printf("New balance: R$ %.2f%n" , balance);
            }else {
                System.out.println("Invalid option! Type a number between 1 and 4!");
            }

            System.out.println();
            System.out.print("Choose one option: ");
            option = scanner.nextInt();
        }

    }


}