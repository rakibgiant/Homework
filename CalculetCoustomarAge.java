import java.util.Scanner;

public class CalculetCoustomarAge {
    public static void main(String[] args) {
        int age, group1=0,group2=0;
        Scanner input = new Scanner( System.in);
        for(int i = 0;i<10;i++){
            System.out.print("Please entre the age of coustomar "+(i+1)+" :");
            age=input.nextInt();
            if(age<30){
             group1++;
            }else{
                group2++;
            }
        }
        System.out.println("under 30 :"+((group1*100)/10)+"%");
        System.out.println("under 30 :"+((group2*100)/10)+"%");
        input.close();

    }
}