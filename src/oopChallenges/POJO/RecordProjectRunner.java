package oopChallenges.POJO;

public class RecordProjectRunner {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            Student s = new Student(
                    switch(i){
                        case 1 ->"Elodie";
                        case 2 ->"Elisa";
                        case 3 ->"Tim";
                        case 4 ->"Joe";
                        case 5 ->"Cal";
                        default -> "Unknown Student";
                    },
                    "00" + i,
                    switch(i) {
                        case 1 -> "11/11/1988";
                        case 2 -> "28/04/1986";
                        case 3 -> "12/12/1966";
                        case 4 -> "05/06/2000";
                        case 5 -> "22/01/1995";
                        default -> "Unknown Date of birth";
                    },
                    "Java class");
            System.out.println(s);
        }


    }
}
