import java.util.Scanner;

public class VerifyUserLogin {

  public static void main(String[] args) {
    String user_name = "Devid";
    int user_password = 72542;
    int chance = 3;
    Scanner input = new Scanner(System.in);
    while (chance > 0) {
      System.out.print("Username: ");
      String name = input.nextLine();
      System.out.print("Password: ");
      int password = input.nextInt();
      input.nextLine();
      if (user_password == password || user_name == name) {
        System.out.println("Welcome to my Shoping System!!!!");
        break;
      } else {
        chance--;
        System.out.println("Type error!!! U have " + chance + " chance left.");
      }
    }
    if (chance == 0) {
      System.out.println("Sorry U have type error 3 times!! Try again later ");
    }
    input.close();
  }
}
