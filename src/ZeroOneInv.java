import acm.program.ConsoleProgram;

public class ZeroOneInv extends ConsoleProgram {
   public void run() {

      int i = readInt("Enter 0 or 1: ");

      if(i == 0) {
         i = 1;
      }else {
         i = 0;
      }

      println("Inverted: " + i);



   }
}