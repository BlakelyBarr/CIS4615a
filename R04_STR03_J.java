/******************************************************************************
 *  Compilation:  javac R04_STR03_J.java
 *  Execution:    java R04_STR03_J
 *
 *  Attempts to convert a BigInteger value to a String and then restore it to a BigInteger value
 *
 * Revision History:
 * - Attempts to convert a BigInteger value to a String and then restore it to a BigInteger value
 *  % java R04_STR03_J
 *  %
 *
 ******************************************************************************/

public class R04_STR03_J {
    
    // Attempts to convert a BigInteger value to a String and then restore it to a BigInteger value
    // Converting the String back to a BigInteger is unlikely to reproduce the original value
    
    BigInteger x = new BigInteger("530500452766");
    byte[] byteArray = x.toByteArray();
    String s = new String(byteArray);
    byteArray = s.getBytes();
    x = new BigInteger(byteArray);

}
