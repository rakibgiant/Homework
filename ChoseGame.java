import java.util.Scanner;

public class ChoseGame {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the YNU Game centar \n");
    System.out.println("Please chose ur favorite Game : \n\n");
    System.out.println("******************************");
    System.out.println("\t\t 1.Poker");
    System.out.println("\t\t 2.Chess");
    System.out.println("\t\t 3.Soccer");
    System.out.println("\t\t 4.Fight");
    System.out.println("******************************\n\n");
    System.out.print("Please entre a number to make a chiose: ");
    int chiose = input.nextInt();
    switch (chiose) {
      case 1:
        System.out.println("Start Poker Game!!");
        break;
      case 2:
        System.out.println("Start Chess Game!!");
        break;
      case 3:
        System.out.println("Start Soccer Game!!");
        break;
      case 4:
        System.out.println("Start Fight Game!!");
        break;
    }
    input.close();
  }
}
