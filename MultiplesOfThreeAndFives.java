public class MultiplesOfThreeAndFives{
  public static void main(String[]main){

    for(int count = 1; count <= 100; count++){
      if (count % 3 == 0 && count % 5 == 0)System.out.println(count);
    }
  }
}
