// I worked on the homework assignment alone, using only course materials.

/**
  * Defines the functionality for a PersonalChefRobot, which is a personalized
  * ChefRobot.
  *
  * @author iwebb6
  * @version 1.0
  */
public class PersonalChefRobot extends ChefRobot {
    private boolean canHostGuests;

    /**
      * Creates a PersonalChefRobot with the given name, dishes, best dish,
      * meals served, and guest hosting ability. This is the preferred
      * constructor.
      *
      * @param name The name of the PersonalChefRobot
      * @param bestDish The name of the PersonalChefRobot's best dish
      * @param mealsServed The number of meals the PersonalChefRobot has served
      * @param menu The meals the PersonalChefRobot can cook
      * @param hostGuests Whether or not the PersonalChefRobot can host guests
      */
    public PersonalChefRobot(String name,
                             String bestDish,
                             int mealsServed,
                             String[] menu,
                             boolean hostGuests) {
        super(name, bestDish, mealsServed, menu);
        canHostGuests = hostGuests;
    }

    /**
      * Default, no parameter constructor. Creates a PersonalChefRobot named
      * &quot;Anonymous&quot; with no best dish, 0 meals served, a null menu,
      * and cannot host guests.
      */
    public PersonalChefRobot() {
        this("Anonymous", "", 0, null, false);
    }

    /**
      * Sets whether or not the PersonalChefRobot can host guests.
      *
      * @param hostGuests Whether or not the PersonalChefRobot can host guests
      */
    public void setCanHostGuests(boolean hostGuests) {
        canHostGuests = hostGuests;
    }

    /**
      * Returns whether or not the PersonalChefRobot can host guests.
      *
      * @return Whether or not the PersonalChefRobot can host guests
      */
    public boolean getCanHostGuests() {
        return canHostGuests;
    }

    /**
      * A toString implementation that outputs basic information about the
      * PersonalChefRobot like name, best dish, and meals served.
      *
      * @return A String containing the PersonalChefRobot's name, best dish,
      *         meals served, and whether or not it can host guests
      */
    @Override
    public String toString() {
        return String.format("Personal %s %s host guests",
                             super.toString(),
                             canHostGuests ? "Can" : "Can not");
    }
}
