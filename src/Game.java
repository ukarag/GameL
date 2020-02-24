
import java.util.*;


public class Game {
    public int round = 0;
    public Boolean running = true;
    private String event;
    public int charcoal = 0;
    public int healthCare;
    public int food;
    public int education;
    public double rateOfChangeCharcoal;
    public double rateOfChangeGrain;

    public void newRound(){
        round++;
        //changeSeason();
        newEvent();
        charcoal();
        healthCare();
        food();
        education();
        changeOfRateCharcoal();
        changeOfRateGrain();
        running = true;

    }

    ArrayList<String> seasons = new ArrayList<String>(Arrays.asList("EarlySummer", "LateSummer", "EarlyAutumn","LateAutumn","EarlyWinter",
            "LateWinter", "EarlySpring", "LateSpring"));

    ArrayList<String> events = new ArrayList<String>(Arrays.asList("Natural Disaster", "Disease", "Fire","Nothing"));


    private int seasonIt = 0;
    private String season = seasons.get(seasonIt);

    public int getRound() {
        return round;
    }

    public void changeSeason(){
        if (seasonIt == 7){
            seasonIt = 0;
            season = seasons.get(seasonIt);
        } else {
            seasonIt += 1;
            season = seasons.get(seasonIt);
        }
    }

    public String getSeason(){
        return season;
    }

    public void newEvent(){
        Random rand = new Random();
        int n = rand.nextInt(100)+1;
        if(n>0 && n<26){
            event = events.get(0);
        }else if(n>25 && n<51){
            event = events.get(1);
        }else if(n>50 && n<71){
            event = events.get(2);
        }else{
            event = events.get(3);
        }
    }

    public String getEvent(){
        return event;
    }

    public void charcoal(){
        if (season == seasons.get(3) || season == seasons.get(6)){
            charcoal = 1;
        }else if (season == seasons.get(4) || season == seasons.get(5)){
            charcoal = 2;
        }
    }

    public void healthCare(){
        Random rand = new Random();

        healthCare = rand.nextInt(4)+1;

    }

    public void food(){
        Random rand = new Random();

        food = rand.nextInt(4)+1;
    }

    public void education(){
        Random rand = new Random();

        int low = 2;
        int high = 5;
        education = rand.nextInt(high-low) + low;
    }

    public void changeOfRateCharcoal(){
        int[] array = {0,1,2};
        double[] change = {1.0, 0.5, 0.33};

        int ind = new Random().nextInt(array.length);
        rateOfChangeCharcoal = change[ind];
    }

    public void changeOfRateGrain(){
        int[] array = {0,1,2};
        double[] change = {1.0, 0.5, 0.33};

        int ind = new Random().nextInt(array.length);
        rateOfChangeGrain = change[ind];
    }

    public void printstuff(){

        System.out.println("--------------Round "+ this.round +"--------------");
        System.out.println("Season " + getSeason());
        System.out.println("Event " + getEvent());
        System.out.println("Market");
        System.out.println("Charcoal " + charcoal);
        System.out.println("Health care " + healthCare);
        System.out.println("Food " + food);
        System.out.println("Education " + education);
        System.out.println("Rate of exchange for charcoal: " + rateOfChangeCharcoal);
        System.out.println("Rate of exchange for grain: " + rateOfChangeGrain);
        System.out.println("-----------------------------------");
    }


}
