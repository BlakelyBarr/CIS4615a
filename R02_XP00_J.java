/******************************************************************************
 *  Compilation:  javac R02_XP00_J.java
 *  Execution:    java R02_XP00_J
 *
 *  Logs unsanitized user input.
 *
 * Revision History:
 * - Added method that does not check values returned by methods
 *  % java R02_XP00_J
 *  %
 *
 ******************************************************************************/

public class R02_XP00_J {
    
    public void deleteFile(){
 
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    someFile.delete();
 
    }

}
