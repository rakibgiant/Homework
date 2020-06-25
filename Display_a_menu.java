import java.util.Scanner;

public class Display_a_menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=1;
        while(count!=0){
            System.out.println("******Welcome to the Jackpot Millioniear System*******");
            System.out.println("\t\t1.Register");
            System.out.println("\t\t2.Log in");
            System.out.println("\t\t1.Lucky Draw");
            System.out.println("*****************************************************************\n");
            System.out.println("Please chiose by input a number: ");
            int chios = input.nextInt();
            switch(chios){
                case 1:
                break;
                case 2:
                break;
                case 3:
                break;
                default:
                System.out.println("Your input is wrong!!");
                break;
            }
            System.out.println("Continu?(y/n): ");
            char con = input.next().charAt(0);
            if(con=='n'){
                break;
            }
            count++;
        }
        input.close();
    }
}