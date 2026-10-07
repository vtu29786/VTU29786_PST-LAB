import java.util.*;
class Bank {
    int balance = 0;

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] op = sc.nextLine().split(" ");
            int amount = Integer.parseInt(op[1]);

            if (op[0].equals("deposit")) {
                b.deposit(amount);
            } else {
                b.withdraw(amount);
            }
        }

        System.out.println(b.balance);

        sc.close();
    }
}