import java.util.Scanner;

public class PerchasAmmountStatement {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] price = new double[5];
    double sum = 0;
    int i = 0; //initial
    while (i < price.length) { //condition
      System.out.print("Please entre"+(i+1)+" item price  :");
      price[i] = input.nextDouble(); //take valu
      sum = sum + price[i]; //sum valu
      i++;
    }
    System.out.println("serioul\t\tprice");
    for (i = 0; i < price.length; i++) {
      System.out.println((i + 1) + "\t\t" + price[i]); //print valu
    }

    System.out.println("Sum\t\t" + sum); //print sum
    input.close();
  }
}
