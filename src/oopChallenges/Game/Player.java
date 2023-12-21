package oopChallenges.Game;

public class Player {

    private String firstName;
    private  int healthPercentage;
    private String weapon;

    public Player(String name) {
        this(name,100,"Axe");
    }

    public Player(String name, int healthPercentage, String weapon) {
        this.firstName = name;
        if(healthPercentage <=0) {
            this.healthPercentage =1;
        } else if(healthPercentage >=100) {
            this.healthPercentage =100;
        } else this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if(healthPercentage <=0){
            System.out.println("Game Over!");
        }

    }


    public int HealthRemaining() {
        return healthPercentage;
    }

    public void healthRestored(int healing) {
        healthPercentage = healthPercentage + healing;
        if(healthPercentage >=100){
            healthPercentage =100;
            System.out.println("player have full health");
        }
    }
}
