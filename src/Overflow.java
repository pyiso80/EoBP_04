import acm.program.ConsoleProgram;

public class Overflow extends ConsoleProgram {
   public void run() {

      int i = 999999 * 999999;
      println(i);

      double d = 0;
      for (int j = 0; j < 10 ; j++) {
         d += 0.1;
      }
      println(d);
   }
}