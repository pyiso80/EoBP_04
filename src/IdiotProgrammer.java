import acm.program.ConsoleProgram;

public class IdiotProgrammer extends ConsoleProgram {
   public void run() {

      for(int i = 0; i < 9; i++) {
         if(i < 3) {
            println("Programming is fun.");
         }
         if(i == 3) {
            println("Assignment 1 is way too hard! :( :( :(");
         }
         if(i >= 3 && i < 6) {
            println("Assignment 1 not done yet!");
         }

         if(i >= 6) {
            println("I'll never learn programming again!!!");
         }
      }

   }
}