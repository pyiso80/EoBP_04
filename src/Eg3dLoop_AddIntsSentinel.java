import acm.program.ConsoleProgram;

public class Eg3dLoop_AddIntsSentinel extends ConsoleProgram {
   public void run() {

      int sum = 0;
      int val = readInt("Enter an int: ");

      while(val != 0) {
         sum += val;
         val = readInt("Enter an int: ");
      }
      println("The sum is: " + sum);

   }
}