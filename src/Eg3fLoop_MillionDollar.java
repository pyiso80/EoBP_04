import acm.program.ConsoleProgram;
/*
This program calculate the number of years taken to accumulate
1 million dollars for a given initial balance and compound interest
rate.

This program illustrate the result calculated inside the loop
controls to continue looping or stop.
 */
public class Eg3fLoop_MillionDollar extends ConsoleProgram {

   public void run() {
      double initBal = readDouble("Enter initial balance: ");
      int interestRate = readInt("Enter interest rate %: ");

      double endOfyrBal = initBal;
      int yr = 0;
      while (endOfyrBal < 1_000_000) {
         print("Cur bal " + endOfyrBal);
         endOfyrBal = endOfyrBal * interestRate/100.0 + endOfyrBal;
         println("Yr End bal:" + endOfyrBal);
         yr++;
      }
      println("Wait " + yr + " for 1M!!!");
   }
}

/*
Note: how do we make sure the program is correct?
yr = 0? or shouldn't it be yr = 1?

How would you prove the program is correct?


st_yr_bal     interest       yr_end_bal

 */