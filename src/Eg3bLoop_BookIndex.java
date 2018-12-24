import acm.program.ConsoleProgram;
/*
page 18
Book Index Printer
 */
public class Eg3bLoop_BookIndex extends ConsoleProgram {
   public void run() {
      //readLine("message") is used to read text input
      String firstWord = readLine("Enter 1st word: ");
      String pageNo = readLine("Enter page no: ");
      int totLineLength = 30;
      //for String variable, the length of the string can be
      //obtained using `varName.length()`
      int numberOfDots
         = totLineLength - (firstWord.length() + pageNo.length());
      print(firstWord);
      for (int i = 0; i < numberOfDots; i++) {
         print(".");
      }
      println(pageNo);
   }

}