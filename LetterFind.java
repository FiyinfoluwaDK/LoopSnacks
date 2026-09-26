import java.util.Scanner;
public class LetterFind{
  public static void main(String[]args){

  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter a word");
  String word = scanner.nextInt();
  
  int letterCount = 0;
    
    for(int count = 0; count < word.length(); count++){
      if ('e' == word.charAt(count)){
        letterCount++;
      }
    }
  System.out.println(letterCount);
  }
}
