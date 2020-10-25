/******************************************************************************
 *  Compilation:  javac R08_VNA00_J.java
 *  Execution:    java R08_VNA00_J
 *
 *   In this compliant solution, the done flag is declared volatile to ensure that writes are visible to other threads
 *
 * Revision History:
 * - In this compliant solution, the done flag is declared volatile to ensure that writes are visible to other threads
 *  % java R08_VNA00_J
 *  %
 *
 ******************************************************************************/

public class R08_VNA00_J {
    
    // In this compliant solution, the done flag is declared volatile to ensure that writes are visible to other threads
    
    final class ControlledStop implements Runnable {
      private volatile boolean done = false;

      @Override public void run() {
        while (!done) {
          try {
            // ...
            Thread.currentThread().sleep(1000); // Do something
          } catch(InterruptedException ie) {
            Thread.currentThread().interrupt(); // Reset interrupted status
          }
        }   
      }

      public void shutdown() {
        done = true;
      }
    }

}
