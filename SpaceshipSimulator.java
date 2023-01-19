import java.util.Scanner;

public class SpaceshipSimulator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the weight of the rocket: ");
    int weight = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Enter the maximum weight of the rocket: ");
    int maxWeight = scanner.nextInt();
    scanner.nextLine();
    Rocket rocket = new Rocket(weight, maxWeight);
    JourneyManager MyJourneys = new JourneyManager();
  
    while (true) {
        System.out.println("Welcome to the spaceship simulator! What would you like to do? (add item, launch, land, fly to planet, show inventory,show journey, quit)");
        String action = scanner.nextLine();
      if (action.equalsIgnoreCase("add item")) {
        System.out.println("Enter the name of the item: ");
        String itemName = scanner.nextLine();
        System.out.println("Enter the weight of the item: ");
        int itemWeight = scanner.nextInt();
        scanner.nextLine();
        rocket.addItem(itemName, itemWeight);
      } else if (action.equalsIgnoreCase("launch")) {
        rocket.launch();
      } else if (action.equalsIgnoreCase("land")) {
        rocket.land();
      }else if (action.equalsIgnoreCase("fly to planet")) {
        if(rocket.getstatus() == true)
        {System.out.println("Enter the name of the planet to fly to: ");
        String planet = scanner.nextLine();
        rocket.flyToPlanet(planet);
        MyJourneys.addJourney(rocket, planet);}
        else {
          System.out.println("Rocket not launched yet");
        }
      } else if (action.equalsIgnoreCase("show inventory")) {
        rocket.showInventory();
      } else if (action.equalsIgnoreCase("show journey")){
        MyJourneys.showJourney();
      } 
      else if (action.equalsIgnoreCase("quit")) {
        break;
      } 
    }
  }
}
