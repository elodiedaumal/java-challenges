package methodChallenges;

public class MethodeChallenge2 {

    public static void main(String[] args) {


        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(3945,0));


    }
    public static String getDurationString(int seconds){
        if(seconds<0) {
            return "Invalid Seconds";
        }

        int hours= seconds/60/60;
        int minutes= seconds/60;
        int remainingMinutes= minutes%60;
        int remainingSeconds= seconds%60;

        return hours + "h " + remainingMinutes + "m " +  remainingSeconds +"s'";

    }

    public static String getDurationString(int seconds, int minutes){
        if(minutes<0 || (seconds <0 || seconds >59)) {
            return "Invalid input";
        }

        int hours = (seconds + minutes * 60) / 3600;
        minutes = (seconds + minutes * 60) / 60;
        int remainingMinutes= minutes%60;
        int remainingSeconds = (seconds + minutes * 60) % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";

    }
}
