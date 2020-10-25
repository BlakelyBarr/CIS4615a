/******************************************************************************
 *  Compilation:  javac R00_IDS03_J.java
 *  Execution:    java R00_IDS03_J
 *
 *  Logs sanitized user input.
 *
 * Revision History:
 * - Added " - sanitized logger"
 *  % java R00_IDS03_J
 *  %
 *
 ******************************************************************************/

public class R00_IDS03_J {

    public static void main(String[] args) {
        
        // Log sanitized user input
        
        if (loginSuccessful) {
          logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
          logger.severe("User login failed for: " + sanitizeUser(username));
        }
        
    }
    
    public String sanitizeUser(String username) {
      return Pattern.matches("[A-Za-z0-9_]+", username))
          ? username : "unauthorized user";
    }

}
