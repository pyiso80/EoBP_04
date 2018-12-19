import acm.program.ConsoleProgram;
/*
page 8
Discount
 */
public class Eg2bCnd_Discount extends ConsoleProgram {
   public void run() {
      int purchaseAmt = readInt("Enter amt \"in cent\": ");
      if(purchaseAmt > 1000) {
         double discountedPrice = purchaseAmt -  purchaseAmt * 0.1;
         println("Discounted Price: " + discountedPrice);
      } else {
         println("Normal Price: " + purchaseAmt);
      }
   }
}