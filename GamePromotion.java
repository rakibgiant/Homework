import java.util.Random;
import java.util.Scanner;

public class GamePromotion {

  public static void main(String[] args) {
    int count = 0;
    Scanner input = new Scanner(System.in);
    Random rendom = new Random();
    System.out.println("YNU Game centre > Game Promotion\n");
    for (int i = 0; i < 5; i++) {
        int rand = rendom.nextInt(101);
      System.out.println("U r playing round " + (i + 1) + " score is: " + rand);
      System.out.println("Keep Playing the next Game(y/n) : ");
      char chiose = input.next().charAt(0);
      if (chiose == 'y') {
        if (rand > 80) {
          System.out.println("Go to the next round");
          count++;
        }
      } else {
        System.out.println("You have Quit the game!!!");
        break;
      }
    }
    if ((count * 100) / 5 > 60) {
        System.out.println("Game Over!!");
        System.out.println("Press the level 2 , Continu to play!");
      } else {
        System.out.println("Sorry!! u failed to level up ! keep going");
      }

  }
}
