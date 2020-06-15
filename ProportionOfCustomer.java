import java.util.Scanner;

public class ProportionOfCustomer {

  public static void main(String[] args) {
    System.out.println(
      "My shopping manegment systeam > Customer information manegment > Add customer information"
    );
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
      System.out.print("Please entre the member number (<4 digits number>): ");
      int num = input.nextInt();
      System.out.print("Please entre the member's birthday (mm/dd): ");
      String birthday = input.nextLine();
      input.nextLine();
      System.out.print("Please entre the member point: ");
      int point = input.nextInt();
      if (num / 10000 != 0) {
        System.out.println("member number " + num + " is a invalid number !");
        System.out.println("Failed to input information !");
      } else {
        System.out.println("New added member information is: ");
        System.out.println(num + "\t\t" + birthday + "\t\t" + point);
      }
    }
    input.close();
  }
}
