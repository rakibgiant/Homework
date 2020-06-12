import java.util.Scanner;

public class LucyDraw {

  public static void main(String[] args) {
    int sum = 0;
    int cus_number;
    Scanner input = new Scanner(System.in);
    System.out.println("Please Entre Your (4 digit) coustomer number: ");
    cus_number = input.nextInt();
    boolean m;
    m = cus_number > 999 && cus_number < 10000;
    int unitsdigit = cus_number % 10;
    int ten_digit = cus_number / 10 % 10;
    int hun_digit = cus_number / 100 % 10;
    int thou_digit = cus_number / 1000;
    sum = unitsdigit + ten_digit + hun_digit + thou_digit;
    System.out.println("Sum of the digit of ur coustomar number is :" + sum);
    boolean x;
    x = sum > 20 && m == true;
    if (x = sum > 20 && m == true) {
      System.out.println("Is he a lucky Coustomar:  " + x);
    } else {
      System.out.println("Is he a lucky Coustomar:  " + false);
    }
    input.close();
  }
}
