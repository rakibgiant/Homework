import java.util.Random;
import java.util.Scanner;

public class Lucky_draw2 {

  public static void main(String[] args) {
    Random ren = new Random();
    int rendom = ren.nextInt(9);
    boolean x = true;
    int sum = 0;
    int cus_number;
    Scanner input = new Scanner(System.in);
    System.out.println("Please Entre Your (4 digit) coustomer number: ");
    cus_number = input.nextInt();
    int unitsdigit = cus_number % 10;
    int ten_digit = cus_number / 10 % 10;
    int hun_digit = cus_number / 100 % 10;
    int thou_digit = cus_number / 1000;
    sum = unitsdigit + ten_digit + hun_digit + thou_digit;
    System.out.println("Sum of the digit of ur coustomar number is :" + sum);
    if (hun_digit == rendom) {
      System.out.println("Is he a lucky Coustomar:  "+x);
    } else {
      System.out.println("Thank you see u next time!!! ");
    }
  }
}
