import java.util.Scanner;

public class QuariGoodsPrice {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char no = 'n';
    System.out.println("My shopping manegment systeam > Checkout");
    System.out.println(
      "**********************************************************************************************\n"
    );
    System.out.println("Please Select the item for purchase: ");
    System.out.println("1.T-shart \t2.Tennis shoes \t3.Tennis Racket");
    System.out.println(
      "**********************************************************************************************\n"
    );
    char chose2 = 'y';
    while (chose2 != no) {
      System.out.println("Please entre the item number: ");
      int chiose = input.nextInt();
      switch (chiose) {
        case 1:
          System.out.println("T-shart : $100.0");
          break;
        case 2:
          System.out.println("Tennis shoes : $200.0");
          break;
        case 3:
          System.out.println("Tennis Racket : $300.0");
          break;
      }
      System.out.println("Conteniue or not(y/n): ");
      chose2 = input.next().charAt(0);
    }
    input.close();
  }
}
