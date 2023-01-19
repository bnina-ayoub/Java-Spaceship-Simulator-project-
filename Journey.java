import java.util.ArrayList;
import java.util.Calendar;

public class Journey {
    private int id;
    private Rocket rocket;
    private String planet;
    private  Calendar cal;
    private String dateTime;

    public Journey(int id, Rocket rocket, String planet) {
        this.id = id;
        this.rocket = rocket;
        this.planet = planet;
        this.cal = Calendar.getInstance();
    }
    public int getId() {
        return id;
    }
    public Rocket getRocket() {
        return rocket;
    }
    public String getName() {
        return planet;
    }
    public String getDateTime() {
        return "Date and Time: "+ cal.get(Calendar.DAY_OF_MONTH) +"/"+(cal.get(Calendar.MONTH)+1) +"/"+cal.get(Calendar.YEAR);
    }
}

class JourneyManager {
    private static ArrayList<Journey> journeys = new ArrayList<Journey>();
    public void addJourney(Rocket rocket, String planet) {
        int id = journeys.size() + 1;
        rocket.setid(id);
        Journey journey = new Journey(id, rocket, planet);
        journeys.add(journey);
        System.out.println("Journey added successfully.");
    }
    public void showJourney() {
        for (Journey journey : journeys) {
            System.out.println("Journey ID: " + journey.getId());
            System.out.println("Rocket: " + journey.getRocket().getId());
            System.out.println("Planet: " + journey.getName());
            System.out.println(journey.getDateTime());
        }
    }
}
