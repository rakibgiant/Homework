public class ComputeTheSumOfEvenNumber {

  public static void main(String[] args) {
    int num, sum = 0;
    num = 0; //inethial
    while (num <= 100) { //condition
      if (num % 2 == 0) {
        sum = sum + num;
      }
      num++; //increment
    }
    System.out.println("Sum of all even number between 0 to 100 is: " + sum);
  }
}
