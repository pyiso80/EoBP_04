import acm.program.ConsoleProgram;
/*
Page 7
Leap Year
 */
public class Eg2aCnd_LeapYr extends ConsoleProgram {
   public void run() {
      int yr = readInt("Enter year: ");
      boolean isLeapYr = (yr % 4 == 0 && yr % 100 != 0) || yr % 400 == 0;
      if (isLeapYr) {
         println(yr + " is leap year.");
      }else {
         println(yr + " is not  leap year.");
      }
   }
}