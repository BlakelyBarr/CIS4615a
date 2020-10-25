/******************************************************************************
 *  Compilation:  javac R05_OBJ05_J.java
 *  Execution:    java R05_OBJ05_J
 *
 *  This noncompliant code example shows a getDate() accessor method that returns the sole instance of the private Date object
 *
 * Revision History:
 * - Added " - bad mutable class
 *  % java R05_OBJ05_J
 *  %
 *
 ******************************************************************************/

public class R05_OBJ05_J {

    // Returning the reference exposes the internal mutable component beyond the trust boundaries of MutableClass
    
    class MutableClass {
      private Date d;

      public MutableClass() {
        d = new Date();
      }

      public Date getDate() {
        return d;
      }
    }

}
