public class SumOfOddNumber {

  public static void main(String[] args) {
    int num, sum = 0;
    for (num = 1; num <= 100; num ++) {
        if(num%2==1){
      sum = sum + num;
    }}
    System.out.println("Sum of all Odd number between 0 to 100 is: " + sum);
  }
}
