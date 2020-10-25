/******************************************************************************
 *  Compilation:  javac R04_STR03_J.java
 *  Execution:    java R04_STR03_J
 *
 *  Produces a String representation of the BigInteger object and then converts the String object to a byte array
 *  This process is then reversed
 * Revision History:
 * - Attempts to convert a BigInteger value to a String and then restore it to a BigInteger value
 *  % java R04_STR03_J
 *  %
 *
 ******************************************************************************/

public class R04_STR03_J {
    
    // Produces a String representation of the BigInteger object and then converts the String object to a byte array
    // This process is then reversed
    
    BigInteger x = new BigInteger("530500452766");
    String s = x.toString();  // Valid character data
    byte[] byteArray = s.getBytes();
    String ns = new String(byteArray); 
    x = new BigInteger(ns);

}
