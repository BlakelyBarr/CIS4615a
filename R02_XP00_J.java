/******************************************************************************
 *  Compilation:  javac R02_XP00_J.java
 *  Execution:    java R02_XP00_J
 *
 *  checks the Boolean value returned by the delete() method
 *
 * Revision History:
 * - checks the Boolean value returned by the delete() method
 *  % java R02_XP00_J
 *  %
 *
 ******************************************************************************/

public class R02_XP00_J {
    
    //This compliant solution checks the Boolean value returned by the delete() method and handles any resulting errors:
    public void deleteFile(){

      File someFile = new File("someFileName.txt");
      // Do something with someFile
      if (!someFile.delete()) {
        // Handle failure to delete the file
      }

    }

}
