/******************************************************************************
 *  Compilation:  javac R03_NUM03_J.java
 *  Execution:    java R03_NUM03_J
 *
 *  requires that the values read are 32-bit unsigned integers and treats the most significant bit as the sign bit
 *
 * Revision History:
 * - Addedthat the values read must be 32-bit unsigned integers
 *  % java R03_NUM03_J
 *  %
 *
 ******************************************************************************/

public class R03_NUM03_J {
    
    //requires that the values read are 32-bit unsigned integers
    
    public static long getInteger(DataInputStream is) throws IOException {
      return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }

}
