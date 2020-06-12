import java.util.Scanner;

public class ShopingAndCheckout {

  public static void main(String[] args) {
    System.out.println(
      "My shopping manegment systeam > Customer information manegment > Add customer information"
    );
    Scanner input = new Scanner(System.in);
    int mamber_number = 5646;
    System.out.print("Please entre the member number (<4 digits number>): ");
    int num = input.nextInt();
    System.out.print("Please entre the member's birthday (mm/dd): ");
    String birthday = input.nextLine();
    input.nextLine();
    if (num == mamber_number) {
      System.out.println("Welcome !!!");
      System.out.print("Please entre the member point: ");
      int point = input.nextInt();
      if (point < 2000) {
        System.out.println("You got 10% discount");
      } else if (2000 <= point) {
        System.out.println("You got 20% discount");
      } else if (4000 <= point) {
        System.out.println("You got 30% discount");
      } else {
        System.out.println("You got 40% discount");
      }
    } else {
      System.out.println("member number " + num + " is a invalid number !");
      System.out.println("Failed to input information !");
    }
    input.close();
  }
}
