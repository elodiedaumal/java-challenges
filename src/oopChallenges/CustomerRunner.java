package oopChallenges;

public class CustomerRunner {
    public static void main(String[] args) {
        Customer elodie = new Customer("elodie",5874.32,"elodie@gmail.com");

        System.out.println(elodie.getName() + "; " + elodie.getEmailAddress()+ "; " + elodie.getCreditLimit() );


        Customer tim = new Customer("tim","tim@gmail.com");

        System.out.println(tim.getName() + "; " + tim.getEmailAddress()+ "; " + tim.getCreditLimit() );


 Customer lisa = new Customer();

        System.out.println(lisa.getName() + "; " + lisa.getEmailAddress()+ "; " + lisa.getCreditLimit() );



    }
}
