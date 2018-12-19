import acm.program.ConsoleProgram;

public class Eg2aCnd_LeapYr extends ConsoleProgram {
   public void run() {
      int yr = readInt("Enter year: ");
      boolean isLeapYr = (yr % 4 == 0 && yr % 100 != 0) || yr % 400 == 0;
      if (isLeapYr) {
         println(yr + " is leap year.");
      }else {
         println(yr + " is not  leap year.");
      }

      int y = 1800;
      int cnt = 0;
      for (int i = 1; i <= 300; i++) {
         if (isLeapYr(y)) {
            cnt++;
            print(y);
            if (cnt % 4 != 0) {
               print("\t");
            }

            if (cnt % 4 == 0) {
               println();
            }
         }
         y++;
      }
   }

   boolean isLeapYr(int yr) {
      return (yr % 4 == 0 && yr % 100 != 0) || yr % 400 == 0;
   }
}