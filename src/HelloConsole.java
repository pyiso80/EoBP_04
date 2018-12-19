import acm.program.ConsoleProgram;

public class HelloConsole extends ConsoleProgram {
   public void run(){
      println("Hello Java");
      //the following lines have the same effect
      print("Hello");
      print(" ");
      print("Java");
      print("\n");//or use println();
      //example of escape sequences
      println("\" \t a \n \n b \\\\");


   }
}