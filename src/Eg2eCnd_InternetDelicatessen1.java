import acm.program.ConsoleProgram;
/*
Internet delicatessen program using cascading if statements.
Page 12 EoBP exercises
 */
public class Eg2eCnd_InternetDelicatessen1 extends ConsoleProgram {
   //const for starting amount of 3$ shipping cost
   static final int INC_SHIPPING_COST_AMT = 1000;
   public void run() {
      String itemName = readLine("Enter item name: ");
      int amtPurchase = readInt("Item price: ");
      boolean overNight = readBoolean("Overnight delivery (Y/N):", "Y", "N");
      int shippingCost = 0;
      if(amtPurchase < INC_SHIPPING_COST_AMT && overNight == true) {
         shippingCost = 700;
      } else {
         if(amtPurchase < INC_SHIPPING_COST_AMT && overNight == false) {
            shippingCost = 200;
         }else {
            if (amtPurchase >= INC_SHIPPING_COST_AMT && overNight == true) {
               shippingCost = 800;
            }else{
               if(amtPurchase >= INC_SHIPPING_COST_AMT && overNight == false) {
                  shippingCost = 300;
               }
            }
         }
      }

      int totalPrice = amtPurchase + shippingCost;

      println("Invoice:");
      println("\tItem:\t\t\t" + itemName);
      println("\tItem cost:\t\t" + (amtPurchase/100.0));
      println("\tShipping cost:\t" + (shippingCost/100.0));
      println("\tTotal price:\t\t" + (totalPrice/100.0));

   }

}