import acm.program.ConsoleProgram;

public class TriangleBaseTip extends ConsoleProgram {
   public void run() {
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5 - i; j++) {
            print("*");
         }
         println();

      }

      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < i + 1; j++) {
            print("*");
         }
         println();

      }

      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5 - (i + 1) ; j++) {
            print(".") ;
         }
         for (int j = 0; j < (i + 1); j++) {
            print(i + 1);
         }
         println();

      }

   }
}