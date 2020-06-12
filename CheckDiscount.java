import java.util.Scanner;

public class CheckDiscount {

  public static void main(String[] args) {
    int member = 4656;
    Scanner input = new Scanner(System.in);
    System.out.println("Please Entre ur member id: ");
    int id = input.nextInt();
    if (id == member) {
      System.out.println("Plz entre  price of product: ");
      int price = input.nextInt();
      if (price > 200) {
        System.out.println("You got 25% discount!!!");
      } else {
        System.out.println("u got 20% discount!!!");
      }
    } else {
      System.out.println("U got 10% discount!!!");
    }
    input.close();
  }
}
