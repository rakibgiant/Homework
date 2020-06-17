import java.util.Scanner;

public class CalculetAverageScore {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[]num= new int[5];
        int sum=0;
        double avg=0;
        System.out.println("Please Entre 5 students score");
        for (int i=0;i<num.length;i++){
            System.out.print("plz Entre "+(i+1)+" numbers : ");
            num[i]=input.nextInt();
        }
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];

        }
       System.out.println("Sum of ur number is : "+sum);
        avg=sum/5;
        System.out.println("ur average number: "+avg);

input.close();
    }
}