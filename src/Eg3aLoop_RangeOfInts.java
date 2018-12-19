import acm.program.ConsoleProgram;
/*
page 18
Range of Ints
 */
public class Eg3aLoop_RangeOfInts extends ConsoleProgram {
   public void run() {
      int start = readInt("Enter Start: ");
      int end = readInt("Enter end: ");

      for (int i = start; i <= end ; i++) {
         println(i);
      }
   }
}