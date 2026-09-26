import java.util.Scanner;
public class MultiplicationTable{
  public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number: ");
    int number = scanner.nextInt();
      
    for(int count = 1; count <= 12; count++){
        System.out.println(number * count);
    }
  }
}
