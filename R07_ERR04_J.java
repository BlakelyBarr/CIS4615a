/******************************************************************************
 *  Compilation:  javac R07_ERR04_J.java
 *  Execution:    java R07_ERR04_J
 *
 *  removes the return statement from the finally block:
 *
 * Revision History:
 * - removes the return statement from the finally block:
 *  % java R07_ERR04_J
 *  %
 *
 ******************************************************************************/

public class R07_ERR04_J {
    
    // solution removes the return statement from the finally block:
    
    class TryFinally {
      private static boolean doLogic() {
        try {
          throw new IllegalStateException();
        } finally {
          System.out.println("logic done");
        }
        // Any return statements must go here;
        // applicable only when exception is thrown conditionally
      }
    }

}
