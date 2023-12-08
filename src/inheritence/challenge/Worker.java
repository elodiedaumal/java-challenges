package inheritence.challenge;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Worker {

    private String name;
    private String dateOfBirth;
    private String endDate;

    public Worker(String name, String dateOfBirth, String endDate) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.endDate = endDate;
    }

    public Worker() {
        this("Unknown Worker", "Unknow date of birth", "Unknow end date");
    }

    public int getAge() {
        // Define the expected date format of the string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Parse the string into a LocalDate object
        LocalDate dob = LocalDate.parse(dateOfBirth, formatter);

        // Calculate the age as before
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }

    public double collectPay(){
        return 2805.65;
    }

    public void terminate(String endDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate eD = LocalDate.parse(endDate, formatter);
        LocalDate currentDate = LocalDate.now();
        if(currentDate.isBefore(eD)){
            System.out.println("Employee is employed");
        }
       else  System.out.println("Employee is terminated");
    }



    public String getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
