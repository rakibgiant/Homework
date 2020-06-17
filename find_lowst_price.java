import java.util.Scanner;

public class find_lowst_price {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] num = new int[5];
    int i;
    for (i = 0; i < num.length; i++) {
      System.out.print("plz Entre price of shop " + (i + 1) + ": ");
      num[i] = input.nextInt();
      input.close();
    }
    int min = num[0];
    for (i = 1; i < num.length; i++) {
      if (min > num[i]) {
        min = num[i];
      }
    }

    System.out.println("Lowest price is: " + min);

  }
}
