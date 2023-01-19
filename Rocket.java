import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;



public class Rocket implements Spaceship {
    private int id;
    private int weight;
    private int maxWeight;
    private ArrayList<String> inventory;
    private ArrayList<String> planets;
    private boolean status;
  
    public Rocket(int weight, int maxWeight) {
      this.weight = weight;
      this.maxWeight = maxWeight;
      this.inventory = new ArrayList<String>();
      this.planets = new ArrayList<String>(Arrays.asList("Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Earth"));
    }
    public int getId() {
      return id;
  }
  public void setid(int id)
  {
    this.id = id;
  }
    public boolean getstatus(){
      return this.status;
    }
  
    public void setstatus(boolean status)
    {
      this.status = status;
    }
  
    public void addItem(String itemName, int itemWeight) {
      if (weight + itemWeight > maxWeight) {
        System.out.println("Error: Cannot add item, exceeded maximum weight of rocket.");
      } else {
        inventory.add(itemName);
        weight += itemWeight;
        System.out.println("Item added successfully.");
      }
    }
  
    public void launch() {
      System.out.println("Igniting engines...");
      try {
        TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
      System.out.println("Liftoff!");
      setstatus(true);
    }
    
    public void land() {
      System.out.println("Activating landing sequence...");
      try {
        TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
      System.out.println("Spaceship has landed safely.");
      setstatus(false);
    }
    public void flyToPlanet(String planet) {
      if (planets.contains(planet)) {
        System.out.println("Initiating flight to " + planet + ". . .");
        try {
          for(int i=5 ; i >=1 ; i--){
          System.out.println("Arriving to " + planet + " in "+i);
          TimeUnit.SECONDS.sleep(1);
      } }catch (InterruptedException e) {
          e.printStackTrace();
      }
      finally{
        System.out.println("Arrived at " + planet + "!");
      }}
       else {
        System.out.println("Error: Invalid planet, please choose from the following: " + planets);
      }
    }
    
    public void showInventory() {
    System.out.println("Inventory: ");
      for (String item : inventory) {
        System.out.println(item);
      }
    }
  
    public int getWeight() {
      return weight;
    }
  }