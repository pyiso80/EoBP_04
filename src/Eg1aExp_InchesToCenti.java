import acm.program.ConsoleProgram;

public class Eg1aExp_InchesToCenti extends ConsoleProgram {
   public void run() {
      println("Feet and inches to centimeters");
      int ft = readInt("Enter number of feet: ");
      //wanted to convert like 5ft and  5.5inches
      double inches = readDouble("Enter number of inches: ");

      double totInches = ft * 12 + inches;
      double totCentimeter = totInches * 2.54;

      println(ft + "ft " + inches + "in = " + totCentimeter + "cm"  );
   }
}