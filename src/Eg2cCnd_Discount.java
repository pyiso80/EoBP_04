import acm.program.ConsoleProgram;
/*
page 8
Another Variation of Discount
 */
public class Eg2cCnd_Discount extends ConsoleProgram {
   public void run() {
      int purAmt = readInt("Enter purchase amt: ");
      double discount = 0;
      String dispTxt = "Normal price: ";
      if (purAmt > 1000) {
         discount = purAmt * 0.1;
         dispTxt = "Discounted price: ";
      }
      println(dispTxt + (purAmt - discount));
   }
}