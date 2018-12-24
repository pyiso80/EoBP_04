import acm.program.ConsoleProgram;

public class IsEven extends ConsoleProgram {
   public void run() {
      int val = readInt("Enter an integer");
      if(val % 2 == 0){
         println(val + " is even number");
      }else {
         println(val + " is odd number");
      }
   }
}