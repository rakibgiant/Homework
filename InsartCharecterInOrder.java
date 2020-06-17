import java.util.Arrays;
import java.util.Scanner;

public class InsartCharecterInOrder {

  public static void main(String[] args) {
    char[] charArray = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
    char[] newchar = new char[1];//new array
    Scanner input = new Scanner(System.in);
    Arrays.sort(charArray);//sort array
    System.out.println("Array is:  " + Arrays.toString(charArray));
    System.out.println("Please entre your chrecter: ");
    char newcharecter = input.next().charAt(0);//take charecter 
    newchar[0]=newcharecter;
    System.out.println("Please entre the index possition: ");
    int possition = input.nextInt();
    int first = charArray.length;
    int second = newchar.length;
    char[] new_array = new char[first + second];//merge 2 array
    System.arraycopy(charArray, 0, new_array, 0, first);//merge 2 arreys element
    System.arraycopy(newchar, 0, new_array, first, second);//merge 2 arreys element
    Arrays.sort(new_array);
    new_array[possition] = newcharecter;
    System.out.println("New Array is:  " + Arrays.toString(new_array));
    input.close();
  }
}
