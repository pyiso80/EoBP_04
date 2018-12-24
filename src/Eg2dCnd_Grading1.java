import acm.program.ConsoleProgram;
/*
Illustrate cascading if.
Try to understand why you don't need to write like below even though
it would not be wrong.

   score >= 65 && score < 80
               -------------
   score >=50 && score < 65
              --------------
 */
public class Eg2dCnd_Grading1 extends ConsoleProgram {
   public void run() {
      int score = readInt("Enter scores: ");
      if (score >= 80) {
         println("A+");
      }else if(score >= 65) {
         println("A");
      } else if (score >= 50) {
         println("B");
      } else if (score >= 40) {
         println("C");
      }else {
         println("D");
      }

   }
}