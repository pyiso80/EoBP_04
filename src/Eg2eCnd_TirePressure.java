import acm.program.ConsoleProgram;
/*
Page 15, Tired Pressure improved
This program would be prone to errors!!!
We'll find ways to make it better.

Should test thoroughly every marginal cases
You will need to test
   1. Out of ranges pressures for every cases
   2. If one of the tires is out of range, "Bad inflation" should printed at the end.
   3. If two front tires are not equal, "Bad inflation" should printed at the end.
   4. If two rear tires are not equal, "Bad inflation" should printed at the end.
 */
public class Eg2eCnd_TirePressure extends ConsoleProgram {
   static final int LOW_P_LIMIT = 35;
   static final int HIGH_P_LIMIT = 45;
   public void run() {
      boolean isBad = false;
      int fli = readInt("Enter front left pressure: ");
      if (!(fli > LOW_P_LIMIT  && fli < HIGH_P_LIMIT)) {
         println(fli);
         println("Warning: pressure out of range!!!");
         isBad = true;
      }
      int fri = readInt("Enter front right pressure: ");
      if (fri <= LOW_P_LIMIT || fri >= HIGH_P_LIMIT) {
         println("Warning: pressure out of range!!!");
         isBad = true;

      }
      int rli = readInt("Enter rear left pressure: ");
      if (rli <= LOW_P_LIMIT || rli >= HIGH_P_LIMIT) {
         println("Warning: pressure out of range!!!");
         isBad = true;
      }
      int rri = readInt("Enter rear left pressure: ");
      if (rri <= LOW_P_LIMIT || rri >= HIGH_P_LIMIT) {
         println("Warning: pressure out of range!!!");
         isBad = true;
      }
      if (rri != rli || fli != fri) {
         println("Unbalance");
         isBad = true;
      }

      if(isBad){
         println("Bad inflation!!!");
      }else{
         println("Good inflation!!!");
      }
   }
}