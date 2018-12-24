import acm.program.ConsoleProgram;
/*
Page 10
 */
public class Eg2eCnd_LastChanceGas extends ConsoleProgram {
   public void run() {

      int tankCapacity = readInt("Tank Capacity:");
      int gageReading = readInt("Gage Reading in %: ");
      int milesPerGallon = readInt("Miles per gallon: ");

      double totalGallons = tankCapacity * gageReading/100.0;
      double totalMiles =  totalGallons * milesPerGallon;

      if (totalMiles < 200) {
         println("Get gas!");
      }else{
         println("Safe to proceed!");
      }

   }
}