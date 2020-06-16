import java.util.Scanner;

public class ProportionOfCustomer2 {
   public static void main(String[] args) {
    System.out.println(
        "My shopping manegment systeam > Customer information manegment > Add customer information"
      );
      Scanner input = new Scanner(System.in);
      for (int i = 0; i < 3; i++) {
        System.out.print("Please entre the member number (<4 digits number>): ");
        int num = input.nextInt();
        int length=String.valueOf(num).length();
        System.out.print("Please entre the member's birthday (mm/dd): ");
        String birthday = input.next();
        System.out.print("Please entre the member point: ");
        int point = input.nextInt();
        if (length!=4) {
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