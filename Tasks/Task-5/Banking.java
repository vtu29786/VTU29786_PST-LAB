import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Banking Transaction System =====");

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit Successful.");
                    } else {
                        System.out.println("Invalid Amount!");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Invalid Amount!");
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal Successful.");
                    }
                    break;

                case 3:
                    System.out.println("Account Holder: " + name);
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using Banking Transaction System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}