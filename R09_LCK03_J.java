/******************************************************************************
 *  Compilation:  javac R09_LCK03_J.java
 *  Execution:    java R09_LCK03_J
 *
 * synchronizes on the intrinsic lock of an instance of ReentrantLock
 *
 * Revision History:
 * - computes and returns the sum of the absolute value of parameters x and y
 *  % java R09_LCK03_J
 *  %
 *
 ******************************************************************************/

public class R09_LCK03_J {
    
    // Synchronizes on the intrinsic lock of an instance of ReentrantLock
    // rather than on the reentrant mutual exclusion Lock encapsulated by ReentrantLock.
   
    private final Lock lock = new ReentrantLock();

    public void doSomething() {
      synchronized(lock) {
        // ...
      }
    }

}
