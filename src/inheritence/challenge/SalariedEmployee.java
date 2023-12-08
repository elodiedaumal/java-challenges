package inheritence.challenge;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String dateOfBirth, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, dateOfBirth, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        System.out.println("Employee is retire");
    }

    @Override
    public void terminate(String endDate) {
        if(isRetired){
            retire();
        }

    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
