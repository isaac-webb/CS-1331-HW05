// I worked on the homework assignment alone, using only course materials.

/**
  * Defines the functionality of a RestaurantChefRobot, which is a restaurant
  * ChefRobot.
  *
  * @author iwebb6
  * @version 1.0
  */
public class RestaurantChefRobot extends ChefRobot {
    private int celebritiesMet;

    /**
      * Creates a RestaurantChefRobot with the given name, dishes, best dish,
      * meals served, and celebritiesMet.
      *
      * @param name The name of the RestaurantChefRobot
      * @param bestDish The name of the RestaurantChefRobot's best dish
      * @param mealsServed The number of meals the RestaurantChefRobot has
      *                    served
      * @param menu The meals the RestaurantChefRobot can cook
      * @param celebrities How many celebrities the RestaurantChefRobot has
      *                    met
      */
    public RestaurantChefRobot(String name,
                               String bestDish,
                               int mealsServed,
                               String[] menu,
                               int celebrities) {
        super(name, bestDish, mealsServed, menu);
        celebritiesMet = celebrities;
    }

    /**
      * Increments the number of celebrities the RestaurantChefRobot has met.
      */
    // public void meetCelebrity() {
    //     celebritiesMet++;
    // }

    /**
      * Sets how many celebrities the RestaurantChefRobot has met.
      *
      * @param celebrities How many celebrities the RestaurantChefRobot has met
      */
    public void setCelebritiesMet(int celebrities) {
        celebritiesMet = celebrities >= 0 ? celebrities : 0;
    }

    /**
      * Returns how many celebrities the RestaurantChefRobot has met.
      *
      * @return How many celebrities the RestaurantChefRobot has met
      */
    public int getCelebritiesMet() {
        return celebritiesMet;
    }

    /**
      * A toString implementation that outputs basic information about the
      * RestaurantChefRobot like name, best dish, and meals served.
      *
      * @return A String containing the RestaurantChefRobot's name, best dish,
      *         meals served, and how many celebrities it has met
      */
    @Override
    public String toString() {
        return String.format("Restaurant %s Has met %d celebrities!",
                             super.toString(),
                             celebritiesMet);
    }
}
