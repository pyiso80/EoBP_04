import acm.program.ConsoleProgram;

public class StarsBlock extends ConsoleProgram {
   public void run() {

      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 10; j++) {
            print("*");
         }
         println();
      }
   }
}