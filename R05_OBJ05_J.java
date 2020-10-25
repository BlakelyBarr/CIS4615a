/******************************************************************************
 *  Compilation:  javac R05_OBJ05_J.java
 *  Execution:    java R05_OBJ05_J
 *
 *  ensures that the caller cannot modify the original internal state, although the copy remains mutable
 *
 * Revision History:
 * - Added " - good mutable class
 *  % java R05_OBJ05_J
 *  %
 *
 ******************************************************************************/

public class R05_OBJ05_J {

    // ensures that the caller cannot modify the original internal state, although the copy remains mutable

    public Date getDate() {
      return (Date)d.clone();
    }

}
