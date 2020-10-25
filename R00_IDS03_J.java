/******************************************************************************
 *  Compilation:  javac R00_IDS03_J.java
 *  Execution:    java R00_IDS03_J
 *
 *  Logs unsanitized user input.
 *
 * Revision History:
 * - Added " - usanitized logger"
 *  % java R00_IDS03_J
 *  %
 *
 ******************************************************************************/

public class R00_IDS03_J {

    public static void main(String[] args) {
        
        // Log unsanitized user input
        if (loginSuccessful) {
          logger.severe("User login succeeded for: " + username);
        } else {
          logger.severe("User login failed for: " + username);
        }
    }

}
