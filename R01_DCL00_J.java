/******************************************************************************
 *  Compilation:  javac R01_DCL00_J.java
 *  Execution:    java R01_DCL00_J
 *
 *  initializes class but causes dependency issues by calling cycle before deposit is defined
 *
 * Revision History:
 * - computes and returns the balance of a cycle
 *  % java R01_DCL00_J
 *  %
 *
 ******************************************************************************/

public class R01_DCL00_J {
    
    // it can cause dependencies due to the order in which variables are defined

    public class Cycle {
      private final int balance;
      private static final Cycle c = new Cycle();
      private static final int deposit = (int) (Math.random() * 100); // Random deposit

      public Cycle() {
        balance = deposit - 10; // Subtract processing fee
      }

      public static void main(String[] args) {
        System.out.println("The account balance is: " + c.balance);
      }
    }
}
