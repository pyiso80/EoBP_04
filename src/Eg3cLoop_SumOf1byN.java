import acm.program.ConsoleProgram;
/*
Page 19
 */
public class Eg3cLoop_SumOf1byN extends ConsoleProgram {
   public void run() {

      int n = readInt("Enter N: ");
      double sum = 0;
      for (int i = 1; i <= n; i++) {
         sum = sum + 1.0/ i;
      }
      println("Sum of 1/Ns is: " + sum);

   }
}