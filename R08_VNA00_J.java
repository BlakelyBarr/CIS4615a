/******************************************************************************
 *  Compilation:  javac R08_VNA00_J.java
 *  Execution:    java R08_VNA00_J
 *
 *   uses a shutdown() method to set the nonvolatile done flag that is checked in the run() method
 *
 * Revision History:
 * - computes and returns the sum of the absolute value of parameters x and y
 *  % java R08_VNA00_J
 *  %
 *
 ******************************************************************************/

public class R08_VNA00_J {
    
    // uses a shutdown() method to set the nonvolatile done flag that is checked in the run() method
    // If one thread invokes the shutdown() method to set the flag, a second thread might not observe that change
    
    final class ControlledStop implements Runnable {
      private boolean done = false;

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
