package inheritence.challenge;

public class ChallengeRunner {
    public static void main(String[] args) {
        Worker worker = new Worker();

        Worker elodie = new Worker("Elodie","11/11/1988","28/12/2023");

        getWorkerInfo(elodie,elodie.getEndDate());

        Employee elisa = new Employee("Elisa","11/11/1988","28/12/2023", 15,"01/06/2022");

        getWorkerInfo(elisa,elisa.getEndDate());

         SalariedEmployee bob = new SalariedEmployee("bob","28/04/1960","28/12/2030", 02,"01/06/1980", 25000.55, true);

        getWorkerInfo(bob,elisa.getEndDate());



    }

    public static void getWorkerInfo(Worker worker, String endDate){
        System.out.println("worker is "+ worker.getAge());
        worker.terminate(endDate);
        System.out.println("Worker is paid " + worker.collectPay() + "EUR");
//

        System.out.println(worker);

        System.out.println("____________");
    }
}
