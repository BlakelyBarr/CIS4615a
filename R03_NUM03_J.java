/******************************************************************************
 *  Compilation:  javac R03_NUM03_J.java
 *  Execution:    java R03_NUM03_J
 *
 *  Assumes that the data read is always signed and treats the most significant bit as the sign bit
 *
 * Revision History:
 * - Added method that does not check signed value
 *  % java R03_NUM03_J
 *  %
 *
 ******************************************************************************/

public class R03_NUM03_J {
    
    //Assumes that the data read is always signed and treats the most significant bit as the sign bit
    public static int getInteger(DataInputStream is) throws IOException {
      return is.readInt(); 
    }

}
