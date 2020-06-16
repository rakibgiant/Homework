import java.util.Scanner;

public class CountGameHitsRate {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int count = 0;
    System.out.println("YNU Game centar > Click rate\n");
    for (int i = 1; i <= 4; i++) {
      System.out.print("Please entre the click rate of game "+i+": ");
      int num = input.nextInt();
      if (num > 100) {
        count++;
      }
    }
    System.out.println("The number of game with more then 100 hits is "+count);
    System.out.println("The parsentage number of game with more then 100 hits is "+((count*100)/4)+"%");
    input.close();
  }
}
