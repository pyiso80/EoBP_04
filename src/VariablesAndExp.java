import acm.program.ConsoleProgram;

public class VariablesAndExp extends ConsoleProgram {
   public void run() {

      int x = (int) 4.232233;
      println(x);

      //==================================================================================

      int intVar = readInt("Prompt Message: ");
      double dVar = readDouble("Prompt Message: ");
      boolean boolVar = readBoolean("Prompt Message: ");
      String strVar = readLine("Prompt Message: ");

      //==================================================================================

      //Use + to print a string and a variable's value on one line.
      double temperature = (95 + 71 + 82.7) / 3.0;
      println("The average temp. was " + temperature);

      int enrolled = 11 + 17 + 4 + 19 + 14;
      println("There are " + enrolled + " students.");
      /*
      Output:
      The average temp. was 82.9
      There are 65 students.
      */

      int x1 = 3;
      println("x1 is " + x); // x is 3
      println(5 * x1 - 1); // 5 * 3 - 1
      //==================================================================================
      int x2 = 3;
      println(x + " here"); // 3 here
      x2 = 4 + 7;
      println("now x is " + x2); // now x is 11

   }
}