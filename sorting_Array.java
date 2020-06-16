import java.util.*;

public class sorting_Array {

  public static void main(String[] args) {
    String[] charArray = {"a","c","u","b","e","p","f","z"};
    System.out.println("**Char Array Before Sorting**\n");
    for (String ch : charArray) {
      System.out.print(ch + "\t");
    }
    System.out.println(" \n");
    System.out.println("**Char Array after Sorting**\n");
    Arrays.sort(charArray);
    for (String ch : charArray) {
      System.out.print(ch + "\t");
    }
    Arrays.sort(charArray, Collections.reverseOrder());
    System.out.println("\n\narray after reverse: " );
    for (String ch : charArray) {
        System.out.print(ch + "\t");
      }

    /*System.out.println("**Char Array after revarce**\n");
    //Collections.reverse(charArray);
    for (String ch : charArray) {
      System.out.print(ch + "\t");
    }*/
    /*
        List<String> listOfharecter = Arrays.asList(charArray);
        Collections.reverse(charArray);
        String[] reversed = listOfharecter.toArray(charArray);
        */
   /*
        String[] typesOfInsurance = {
      "Life Insurance",
      "Car Insurance",
      "Health Insurance",
    };
    System.out.println(
      "array before reverse: " + Arrays.toString(typesOfInsurance)
    );
    List<String> listOfProducts = Arrays.asList(typesOfInsurance);
    Collections.reverse(listOfProducts);
    String[] reversed = listOfProducts.toArray(typesOfInsurance);
    System.out.println("array after reverse: " + Arrays.toString(reversed));
    */
  }
}
