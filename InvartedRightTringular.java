import java.util.Scanner;

public class InvartedRightTringular {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i,row,clo;
        System.out.println("how many row u want: ");
        row=input.nextInt();
        for(i=row;i>=1;i--){
            for(clo=1;clo<=i;clo++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    
}