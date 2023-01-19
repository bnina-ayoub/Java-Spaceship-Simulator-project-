# Java-Spaceship-Simulator-project-
This project simulates a spaceship with basic functionalities like launching, landing, and adding items to the inventory. The spaceship is implemented as a Rocket class, which implements the Spaceship interface. The Rocket class has properties for weight, maxWeight, Journey and  inventory.

The addItem method of the Rocket class allows users to add items to the inventory but checks if the weight of the item exceeds the maxWeight of the rocket, if so it returns an error message. The launch and land methods of the Rocket class simply print messages indicating that the rocket has launched or landed.

The main class SpaceshipSimulator contains a main method that creates an instance of the Rocket class and prompts the user for input to perform various actions like adding items, launching, landing, and quitting the simulation.

The Scanner class is used to read input from the user. The program runs in an infinite loop until the user chooses to quit the simulation.

The JourneyManager class has an ArrayList of Journey objects and methods to add a journey and list all the stored journeys. The Journey class has a destination and a date as properties, and getters and setters for these properties.

You can use the JourneyManager class to keep track of the different journeys that the spaceship is taking. In the main method of the SpaceshipSimulator class, you can instantiate a JourneyManager object and use its methods to add and list journeys.

It's a simple simulation project that provides an example of how to create an object-oriented program using interfaces and classes in Java. It's also a good exercise for beginners to practice using basic control structures like loops and conditionals.
