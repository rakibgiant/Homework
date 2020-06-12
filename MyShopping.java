import java.util.Scanner;

public class MyShopping {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("\t\t\t\tWelcome to My Shopping Manegment System");
    System.out.println(
      "**********************************************************************************************\n"
    );
    System.out.println("\t\t\t\t 1.Customar information Manegment ");
    System.out.println("\t\t\t\t2.Shopping and Checkout");
    System.out.println(
      "\t\t\t\t3.Sciencirly Give back to our coustomar with rewards "
    );
    System.out.println("\t\t\t\t4. Log Out");
    System.out.println(
      "\n**********************************************************************************************\n"
    );
    int chiose = 5;
    while (chiose > 4) {
      System.out.print("Entre a number: ");
      chiose = input.nextInt();
      System.out.println("Wrong Input Please re-entre the number!!");
    }
  }
}
