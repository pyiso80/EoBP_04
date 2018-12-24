import acm.program.ConsoleProgram;

public class NestedLoopEg02 extends ConsoleProgram {
   public void run() {
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < i + 1; j++) {
            print("*");
         }
         println();
      }
   }
}

/*
1 iter
   i = 0
      j < 1  //i + 1 = 1
      only one * will be printed
   new line

2nd iter
   i = 1
      j < 2 // i + 1 = 2
      inner loop will print **
   new line


 */