package oopChallenges;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);
        System.out.println(bankAccount.getAccountBalance());
        bankAccount.deposit(-500);
        bankAccount.withdraw(-500);
        System.out.println(bankAccount.getAccountBalance());

    }
}
