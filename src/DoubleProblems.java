import acm.program.ConsoleProgram;

public class DoubleProblems extends ConsoleProgram {
   public void run() {

      double delta = 0.1;
      double sum = 0;

      for (int i = 0; i < 10; i++) {
         sum += delta;
         println("Sum of 0.1: " + sum);
      }

      sum = 0; //reset sum
      //this is infinite loop!!!
      while (sum != 1) {
         println(sum += delta);
      }
      ///println(sum == 1.0);

      //println(100_000_000.0f - 0.00124f);

      //println(1.0/0.1);

   }
}