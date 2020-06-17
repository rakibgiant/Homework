import java.util.Scanner;

public class Print_an_isosceles_triangle {

  public static void main(String[] args) {
    int i, j, n;
    Scanner input = new Scanner(System.in);
    System.out.println("How many row u want: ");
    n = input.nextInt();

    for (i = 1; i <= n; i++) {
      for (j = i; j <= n; j++) {
        System.out.print(" ");
      }
      for (j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
}
