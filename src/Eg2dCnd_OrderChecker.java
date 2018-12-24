import acm.program.ConsoleProgram;
/*
Page 9
 */
public class Eg2dCnd_OrderChecker extends ConsoleProgram {
   public void run() {
      int numOfBolts = readInt("Enter num of bolts: ");
      int numOfNuts = readInt("Enter num of nuts: ");
      int numOfWasher = readInt("Enter num Of washers: ");

      if(numOfNuts < numOfBolts) {
         println("Too few nuts!");
      }

      if(numOfWasher < 2 * numOfBolts) {
         println("Too few washers!");
      }

      int tot = numOfBolts * 5 + numOfNuts * 3 + numOfWasher * 1;

      println("The total price is: " + tot);


   }
}