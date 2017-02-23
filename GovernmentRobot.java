// I worked on the homework assignment alone, using only course materials.

/**
  * Defines the functionality of a GovernmentRobot, which is a government
  * specific version of a Robot.
  *
  * @author iwebb6
  * @version 1.0
  */
public class GovernmentRobot extends Robot {
    private int projectCount;
    private boolean hasSecurityClearance;

    /**
      * Creates a GovernmentRobot with the given name, project number, and
      * security clearance. This is the preferred constructor.
      *
      * @param name The name of the GovernmentRobot
      * @param projects The number of projects the GovernmentRobot has completed
      * @param securityClearance Whether or not the GovernmentRobot has security
      *                          clearance
      */
    public GovernmentRobot(String name,
                           int projects,
                           boolean securityClearance) {
        super(name);
        projectCount = projects >= 0 ? projects : 0;
        hasSecurityClearance = securityClearance;
    }

    /**
      * Default, no parameter constructor. Creates a GovernmentRobot named
      * &quot;Anonymous&quot; with 0 projects and no security clearance.
      */
    public GovernmentRobot() {
        this("Anonymous", 0, false);
    }

    /**
      * Sets the number of projects the GovernmentRobot has completed.
      *
      * @param projects The number of projects the GovernmentRobot has completed
      */
    public void setProjectCount(int projects) {
        projectCount = projects >= 0 ? projects : 0;
    }

    /**
      * Returns the number of projects the GovernmentRobot has completed.
      *
      * @return The number of projects the GovernmentRobot has completed
      */
    public int getProjectCount() {
        return projectCount;
    }

    /**
      * Sets the security clearance of the GovernmentRobot.
      *
      * @param securityClearance Whether or not the GovernmentRobot has security
      *                          clearance
      */
    public void setHasSecurityClearance(boolean securityClearance) {
        hasSecurityClearance = securityClearance;
    }

    /**
      * Returns the GovernmentRobot's security clearance.
      *
      * @return Whether or not the GovernmentRobot has security clearance
      */
    public boolean getHasSecurityClearance() {
        return hasSecurityClearance;
    }

    /**
      * A toString implementation that outputs the name of the GovernmentRobot.
      *
      * @return A String containing the GovernmentRobot's name and title
      */
    @Override
    public String toString() {
        return String.format(
            "Government Robot %s Has completed %d projects and %s security"
            + " clearance.",
            super.toString(),
            projectCount,
            hasSecurityClearance ? "has" : "doesn't have");
    }
}
