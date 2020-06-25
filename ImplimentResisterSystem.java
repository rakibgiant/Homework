import java.util.Scanner;

public class ImplimentResisterSystem {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int count = 1;
    while (count != 0) {
      System.out.println(
        "******Welcome to the Jackpot Millioniear System*******"
      );
      System.out.println("\t\t1.Register");
      System.out.println("\t\t2.Log in");
      System.out.println("\t\t1.Lucky Draw");
      System.out.println(
        "*****************************************************************\n"
      );
      System.out.println("Please chiose by input a number: ");
      int chios = input.nextInt();
      switch (chios) {
        case 1:
          resister();
          break;
        case 2:
          break;
        case 3:
          break;
        default:
          System.out.println("Your input is wrong!!");
          break;
      }
      
      System.out.println("Continu?(y/n): ");
      char con = input.next().charAt(0);
      if (con == 'n') {
        System.out.println("System Exit! Thanks for Using.");
        break;
      }
      count++;
      input.close();
    }
  }

  private static void resister() {
    Scanner input = new Scanner(System.in);
    String name;
    int password, id;

    System.out.println("Please fill in Ur personal registation information ");
    System.out.println("Username: ");
    name = input.nextLine();
    System.out.println("Password: ");
    password = input.nextInt();
    int max = 9999;
    int min = 1000;
    id = (int) (Math.random() * (max - min)) + min;
    System.out.println("Successfully resistered , please remamber ur id number.");
    System.out.println("Username \t\t password \t\t User ID");
    System.out.println(name+"\t\t\t"+password+"\t\t\t"+id);
    input.close();
  }
}
