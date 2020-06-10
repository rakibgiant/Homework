import java.util.Scanner;

public class calculet_discunt {

  public static void main(String[] args) {
    final double T_sart = 250, shoes = 780, tennis_racket = 45;
    Scanner input = new Scanner(System.in);
    System.out.println("Please entre a discunt: ");
    double dis = input.nextDouble();
    double new_sart = T_sart * dis, new_shoes = shoes * dis, new_rak =
      tennis_racket * dis;
      double new_sart_price = T_sart-new_sart, new_shoes_price = shoes - new_shoes, new_rak_price =
      tennis_racket - new_rak;

    // boolean x =new_sart<100;
    if (new_sart_price > 100) {
      System.out.println(
        "Is the T-Shart less then 100 at a discount ?" + (new_sart_price > 100)
      );
    } else {
      System.out.println(
        "Is the T-Shart less then 100 at a discount ?" + false
      );
    }
    if (new_shoes_price > 100) {
      System.out.println(
        "Is the shoes less then 100 at a discount ?" + (new_shoes_price > 100)
      );
    } else {
      System.out.println(
        "Is the shoes less then 100 at a discount ?" + false
      );
    }
    if (new_rak_price > 100) {
      System.out.println(
        "Is the tennis_racket less then 100 at a discount ?" + (new_rak_price > 100)
      );
    }  else {
      System.out.println(
        "Is the tennis_racket less then 100 at a discount ?" + false
      );
    }
    input.close();
  }
}
