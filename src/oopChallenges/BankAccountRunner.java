package oopChallenges;

public class BankAccountRunner {
    public static void main(String[] args) {

        Account elodieAccount = new Account("12345", 1500,
                "Elodie Daumal", "myemail@elodie.com",
                "614 168 008");

        System.out.println(elodieAccount.getNumber());
        System.out.println(elodieAccount.getBalance());



        elodieAccount.withdrawFunds(100.0);
        elodieAccount.depositFunds(250);
        elodieAccount.withdrawFunds(50);

        elodieAccount.withdrawFunds(200);

        elodieAccount.depositFunds(100);
        elodieAccount.withdrawFunds(45.55);
        elodieAccount.withdrawFunds(54.46);

        elodieAccount.withdrawFunds(54.45);
    }
}
