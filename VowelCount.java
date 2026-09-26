import java.util.Scanner;
public class VowelCount{
  public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a word");
    String word = scanner.next();

    int vowelCount = 0;

    for(int count = 0; count < word.length(); count++){
      char letter = word.charAt(count);

      if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
        vowelCount++;
      }
    }

    System.out.println(vowelCount);
  }
}
