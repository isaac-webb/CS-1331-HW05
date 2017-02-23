// I worked on the homework assignment alone, using only course materials.

import java.util.Random;

/**
  * Defines the functionality of a ChefRobot, which is a chef version subclass
  * of a Robot.
  *
  * @author iwebb6
  * @version 1.0
  */
public class ChefRobot extends Robot {
    private String bestDish;
    private int mealsServedCount;
    private String[] menu;

    /**
      * Creates a ChefRobot with the given name, dishes, best dish, and meal
      * count. This is the preferred constructor.
      *
      * @param name The name of the ChefRobot
      * @param bestDish The name of the ChefRobot's best dishes
      * @param mealsServed The number of meals the ChefRobot has served
      * @param menu The meals that the ChefRobot can cook
      */
    public ChefRobot(String name,
                     String bestDish,
                     int mealsServed,
                     String[] menu) {
        super(name);
        this.bestDish = bestDish;
        mealsServedCount = mealsServed >= 0 ? mealsServed : 0;
        this.menu = menu;
    }

    /**
      * Default, no parameter constructor. Creates a ChefRobot named
      * &quot;Anonymous&quot; with no best dish, 0 meals served, and a null
      * menu.
      */
    public ChefRobot() {
        this("Anonymous", "", 0, null);
    }

    /**
      * Serves a random dish from the ChefRobot's menu
      *
      * @return The name of the random dish being served
      */
    public String serveMeal() {
        if (menu != null && menu.length > 0) {
            Random rand = new Random();
            mealsServedCount++;
            return menu[rand.nextInt(menu.length)];
        }
        return null;
    }

    /**
      * Sets the ChefRobot's best dish.
      *
      * @param dish The name of the ChefRobot's best dish
      */
    public void setBestDish(String dish) {
        bestDish = dish;
    }

    /**
      * Returns the ChefRobot's best dish.
      *
      * @return The name of the ChefRobot's best dish
      */
    public String getBestDish() {
        return bestDish;
    }

    /**
      * Set the number of meals the ChefRobot has served.
      *
      * @param mealsServed The number of meals the ChefRobot has served
      */
    public void setMealsServed(int mealsServed) {
        mealsServedCount = mealsServed >= 0 ? mealsServed : 0;
    }

    /**
      * Returns the number of meals the ChefRobot has served.
      *
      * @return The number of meals the ChefRobot has served
      */
    public int getMealsServed() {
        return mealsServedCount;
    }

    /**
      * Sets the ChefRobot's menu.
      *
      * @param newMenu The ChefRobot's menu
      */
    public void setMenu(String[] newMenu) {
        menu = newMenu;
    }

    /**
      * Returns the ChefRobot's menu.
      *
      * @return The ChefRobot's menu
      */
    public String[] getMenu() {
        return menu;
    }

    /**
      * A toString implementation that outputs basic information like best dish
      * and name of the ChefRobot.
      *
      * @return A String containing the ChefRobot's name, best dish, and meals
      *         served
      */
    @Override
    public String toString() {
        return String.format("Chef %s Meals served: %d. Best dish: %s.",
                             super.toString(),
                             mealsServedCount,
                             bestDish);
    }
}
