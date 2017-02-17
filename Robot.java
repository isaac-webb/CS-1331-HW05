// I worked on the homework assignment alone, using only course materials.

/**
  * Defines the basic functionality of a Robot for the purpose of our
  * simulation.
  *
  * @author iwebb6
  * @version 1.0
  */
public class Robot {
    private String name;

    /**
      * Creates a new Robot with the given name.
      *
      * @param name The name to be given to the Robot
      */
    public Robot(String name) {
        this.name = name;
    }

    /**
      * Sets the name of the Robot.
      *
      * @param newName The name for this Robot to be set to
      */
    public void setName(String newName) {
        name = newName;
    }

    /**
      * Returns the name of the Robot.
      *
      * @return The name of the Robot
      */
    public String getName() {
        return name;
    }

    /**
      * A toString implementation that outputs the name of the Robot.
      *
      * @return A String containing the Robot's name
      */
    @Override
    public String toString() {
        return name + ".";
    }
}
