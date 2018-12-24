import acm.program.ConsoleProgram;
/*
page 34
 */
public class Eg3gLoop_CreditCardBill extends ConsoleProgram {
   public void run() {
      /* Print the table heading */
      printf("|%6s", "Mth");
      printf("|%15s", "Cur Bal");
      printf("|%10s", "Interest");
      printf("|%5s", "Paid");
      printf("|%15s", "Left");
      println();
      /* Print line separator after the table heading */
      for(int i = 0; i < 60; i++) {
         print("-");
      }
      println();

      /*
      curBal is amt to pay at the beginning of each month.
      Interest for each month is calculated on this amount.
       */
      double curBal = 1000;
      int mthPay = 100;
      double interestRate = 0.015;

      /*
      Amt still left to pay after monthly payment
      Before any monthly payment has been made, it's same as current balance.
       */
      double leftToPay = curBal;
      int m = 0;

      while (leftToPay >= 0) {

         double interest = curBal * interestRate;
         leftToPay = curBal - mthPay + interest;

         printf("|%2d Mth", m);
         printf("|%15.5f", curBal);
         printf("|%10.5f", interest);
         printf("|%5d", mthPay);
         printf("|%15.5f", leftToPay);
         println();//done printing for current month payment

         curBal = leftToPay;//update for the next month
         m++;
      }

   }
}

/*
Note:
Time           cur_bal   1mth_int    left_to_pay        paid
Cur            1000      15          915                100
After 1 mth    915       13.725      828.725            100
After 2 Mth    828.725   12.430875   741.155875         100


Q: why start with 0, should't it be started with 1 and the total months is 11?
Think about duration.
 */