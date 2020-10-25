/******************************************************************************
 *  Compilation:  javac R06_MET01_J.java
 *  Execution:    java R06_MET01_J
 *
 *  computes and returns the sum of the absolute value of parameters x and y
 *
 * Revision History:
 * - computes and returns the sum of the absolute value of parameters x and y
 *  % java R06_MET01_J
 *  %
 *
 ******************************************************************************/

public class R06_MET01_J {
    
    // it can produce incorrect results because of integer overflow
    
    public static int getAbsAdd(int x, int y) {
      return Math.abs(x) + Math.abs(y);
    }
    getAbsAdd(Integer.MIN_VALUE, 1);

}
