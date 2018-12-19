import acm.program.ConsoleProgram;

public class AddOneToHundred extends ConsoleProgram {
   public void run() {

      int sum = 0;

      for (int i = 1; i <= 100 ; i++) {
         sum += i;
      }

      println(sum);

   }
}