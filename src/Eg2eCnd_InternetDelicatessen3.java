import acm.program.ConsoleProgram;

/*
Similar variant of internet delicatessen program.
Page 12 EoBP exercises
 */

public class Eg2eCnd_InternetDelicatessen3 extends ConsoleProgram {
   public void run() {
      String itemName = readLine("Enter item name: ");
      int amtPurchase = readInt("Item price: ");
      boolean overNight = readBoolean("Overnight delivery (Y/N):", "Y", "N");
      int shippingCost = 200;

      if (amtPurchase >= 1000) {
         shippingCost = 300;
      }

      if (overNight) {
         shippingCost += 500;
      }

      int totalPrice = amtPurchase + shippingCost;

      println("Invoice:");
      println("\tItem:\t\t\t" + itemName);
      println("\tItem cost:\t\t" + (amtPurchase / 100.0));
      println("\tShipping cost:\t" + (shippingCost / 100.0));
      println("\tTotal price:\t\t" + (totalPrice / 100.0));

   }

}

/*
Test data:
1000, N
1000, Y
1001, N
1001, Y
9999, N
9999, Y
 */