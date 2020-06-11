import java.util.Scanner;

public class Customer_info {
    public static void main(String[] args) {
        System.out.println("My shopping manegment systeam > Customer information manegment > Add customer information");
        Scanner input = new Scanner(System.in);
        int mamber_number = 5646;
        System.out.print("Please entre the member number (<4 digits number>): ");
        int num = input.nextInt();
        System.out.print("Please entre the member's birthday (mm/dd): ");
        String birthday = input.nextLine();
        input.nextLine();
        System.out.print("Please entre the member point: ");
        int point = input.nextInt();
        if(num==mamber_number){
            System.out.println("Welcome !!!");
        }else{
            System.out.println("member number "+num+" is a invalid number !");
            System.out.println("Failed to input information !");
        }
        input.close();
        
    }
    
}