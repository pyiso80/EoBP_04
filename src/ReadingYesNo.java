import acm.program.ConsoleProgram;

public class ReadingYesNo extends ConsoleProgram {
   public void run() {
      boolean b = readBoolean("Play again? ", "Yes", "No");
      println(b);
   }
}