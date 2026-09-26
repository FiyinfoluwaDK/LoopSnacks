import java.util.Scanner;
public class LetterPrint{
  public static void main(String[]args){

  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter a word");
  String word = scanner.nextInt();
    
    for(int count = 0; count < word.length(); count++){
      System.out.println(word.charAt(count));
    }
  }
}
