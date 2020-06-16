import java.util.Scanner;

public class AddUserInfo {

  public static void main(String[] args) {
    System.out.println("YNU Game centre > Add User information\n");
    Scanner input = new Scanner(System.in);
    System.out.println("Please entre the number of users to be added: ");
    int player_number = input.nextInt();
    for (int i = 1; i <= player_number; i++) {
      System.out.println("Please entre the 4 digit number as user number: ");
      int user_number = input.nextInt();
      System.out.print("Please Entre the player  age: ");
      int age = input.nextInt();
      if (age < 10) {
        System.out.println("I'm Sorry! U are not old enough to play game ,");
        System.out.println("Failed to input information ! ");
      } else {
        System.out.print("Please entre the user point: ");
        int point = input.nextInt();
        System.out.println("The user U add is ");
        System.out.println(
          "User number: " +
          user_number +
          "\t\tAge:" +
          age +
          "\t\tPoint: " +
          point
        );
      }
    }
    input.close();
  }
}
