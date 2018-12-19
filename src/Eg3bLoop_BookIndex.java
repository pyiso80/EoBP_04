import acm.program.ConsoleProgram;
/*
page 18
Book Index Printer
 */
public class Eg3bLoop_BookIndex extends ConsoleProgram {
   public void run() {
      String firstWord = readLine("Enter 1st word: ");
      String pageNo = readLine("Enter page no: ");
      int totLineLength = 30;
      int numberOfDots = totLineLength - (firstWord.length() + pageNo.length());
      print(firstWord);
      for (int i = 0; i < numberOfDots; i++) {
         print(".");
      }
      println(pageNo);

   }

}