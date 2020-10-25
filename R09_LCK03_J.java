/******************************************************************************
 *  Compilation:  javac R09_LCK03_J.java
 *  Execution:    java R09_LCK03_J
 *
 *  solution uses the lock() and unlock() methods provided by the Lock interface.
 *
 * Revision History:
 * -  solution uses the lock() and unlock() methods provided by the Lock interface.
 *  % java R09_LCK03_J
 *  %
 *
 ******************************************************************************/

public class R09_LCK03_J {
    
    //  solution uses the lock() and unlock() methods provided by the Lock interface.
   
    private final Lock lock = new ReentrantLock();

    public void doSomething() {
      lock.lock();
      try {
        // ...
      } finally {
        lock.unlock();
      }
    }

}
