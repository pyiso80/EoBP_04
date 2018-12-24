import acm.program.ConsoleProgram;

/*
Another variation of Grading program only using if statement.
Q: Can you left out `&& score < 80` etc from the conditions?
Q: How is it different from the previous Eg2dCnd_Grading1, using cascading ifs.
 */
public class Eg2dCnd_Grading2 extends ConsoleProgram {
   public void run() {
      int score = readInt("Enter scores: ");
      if (score >= 80) {
         println("A+");
      }
      if (score >= 65 && score < 80) {
         println("A");
      }
      if (score >= 50 && score < 65) {
         println("B");
      }
      if (score >= 40 && score < 50) {
         println("C");
      }
      if (score < 40) {
         println("D");
      }
   }
}