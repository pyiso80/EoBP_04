import acm.program.ConsoleProgram;
/*
Internet delicatessen program using cascading if statements.
Page 12 EoBP exercises
 */
public class Eg2eCnd_InternetDelicatessen2 extends ConsoleProgram {
   static final int INC_SHIPPING_COST_AMT = 1000;
   public void run() {
      String itemName = readLine("Enter item name: ");
      int amtPurchase = readInt("Item price: ");
      boolean overNight = readBoolean("Overnight delivery (Y/N):", "Y", "N");
      int shippingCost = 0;

      if(amtPurchase < INC_SHIPPING_COST_AMT && overNight == true){
         shippingCost = 700;
      }else if(amtPurchase < INC_SHIPPING_COST_AMT && overNight == false) {
         shippingCost = 200;
      }else if(amtPurchase >= INC_SHIPPING_COST_AMT && overNight == true) {
         shippingCost = 800;
      }else if(amtPurchase >= INC_SHIPPING_COST_AMT && overNight == false) {
         shippingCost = 300;
      }else {
         println("invalid choice");
      }

      //Question: can you omit `== true` from all the conditions?
      //can you also omit `== false`
      //try to understand why you can and why you can't
      /*
      if(amtPurchase < 1000 && overNight){
         shippingCost = 700;
      }else if(amtPurchase < 1000 && overNight == false) {
         shippingCost = 200;
      }else if(amtPurchase >= 1000 && overNight) {
         shippingCost = 800;
      }else if(amtPurchase >= 100 && overNight == false) {
         shippingCost = 300;
      }else {
         println("invalid choice");
      }
       */

      int totalPrice = amtPurchase + shippingCost;

      println("Invoice:");
      println("\tItem:\t\t" + itemName);
      println("\tItem cost:\t\t" + (amtPurchase/100.0));
      println("\tShipping cost:\t\t" + (shippingCost/100.0));
      println("\tTotal price:\t\t" + (totalPrice/100.0));

   }

}