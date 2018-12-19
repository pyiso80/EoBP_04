import acm.program.ConsoleProgram;

public class Eg2bCnd_Discount extends ConsoleProgram {
   public void run() {

      int x = 10;
      //x = x - x * 0.1;

      int purchaseAmt = readInt("Enter amt: ");
      if(purchaseAmt > 1000) {
         //purchaseAmt = purchaseAmt -  purchaseAmt * 0.1;
         println("Discounted Price: " + purchaseAmt);
      } else {
         println("Normal Price: " + purchaseAmt);
      }
   }
}