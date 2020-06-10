import java.util.Random;
import java.util.Scanner;

public class Lucky_draw {
  int sum = 0;

  public static void main(String[] args) {
    Random ren = new Random();
    int rendom = ren.nextInt(9);
    boolean x = true;
    int customar_number, hun_digit;
    Scanner input = new Scanner(System.in);
    System.out.println("Please Entre Your (4 digit) coustomer number: ");
    customar_number = input.nextInt();
    Lucky_draw obj = new Lucky_draw();
    int a = obj.add(customar_number);
    hun_digit = customar_number / 100%10;
    System.out.println("Sum of the digit of ur coustomar number is :" + a);
    if (hun_digit == rendom) {
      System.out.println("Is he/she a Lucky coustomer: " + x);
    } else {
      System.out.println("Is he/she a Lucky coustomer: " + false);
    }
    input.close();
  }

  int add(int n) {
    sum = n % 10;
    if (n == 0) {
      return 0;
    } else {
      return sum + add(n / 10);
    }
  }
}
