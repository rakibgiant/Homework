import java.util.Scanner;

public class Count_the_item {

  public static void main(String[] args) {
    int count = 0;
    double price;
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      System.out.println(
        "Please Entre the prices of the item of person " + (+i + 1) + ": "
      );
      for (int j = 0; j < 3; j++) {
        price = input.nextDouble();

        if (price > 300) {
          count++;
        }
      }
      System.out.println(
        "Person " +(+ i + 1) + " will get 20% discount on " + count + " item !"
      );
      count = 0;
    }
  }
}
