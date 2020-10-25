/******************************************************************************
 *  Compilation:  javac R07_ERR04_J.java
 *  Execution:    java R07_ERR04_J
 *
 *  The finally block completes abruptly because of a return statement in the block:
 *
 * Revision History:
 * - computes and returns the sum of the absolute value of parameters x and y
 *  % java R07_ERR04_J
 *  %
 *
 ******************************************************************************/

public class R07_ERR04_J {
    
    // The finally block completes abruptly because of a return statement in the block:
    // The IllegalStateException is suppressed by the abrupt completion of the finally block caused by the return statement
    
    class TryFinally {
      private static boolean doLogic() {
        try {
          throw new IllegalStateException();
        } finally {
          System.out.println("logic done");
          return true;
        }
      }
    }

}
