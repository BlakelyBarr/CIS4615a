/******************************************************************************
 *  Compilation:  javac R01_DCL00_J.java
 *  Execution:    java R01_DCL00_J
 *
 *  initializes class that computes and returns the balance of a cycle
 *
 * Revision History:
 * - computes and returns the balance of a cycle
 *  % java R01_DCL00_J
 *  %
 *
 ******************************************************************************/

public class R01_DCL00_J {
    
    // It redid the order so nothing can cause dependency issues

    public class Cycle {
      private final int balance;
      private static final int deposit = (int) (Math.random() * 100); // Random deposit
      private static final Cycle c = new Cycle();  // Inserted after initialization of required fields
      public Cycle() {
        balance = deposit - 10; // Subtract processing fee
      }

      public static void main(String[] args) {
        System.out.println("The account balance is: " + c.balance);
      }
    }
}
