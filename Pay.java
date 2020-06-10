import java.util.Scanner;

public class Pay{
    public static void main(String[] args) {
        double shose_pric = 880,raket_price = 780,tennis_price = 45;
        int so_number=2,rak_number = 1,tennis_number=2;
        double so_ammount = shose_pric*so_number,rak_ammount=raket_price*rak_number,tennis_ammount=tennis_price*tennis_number;
        double amount=so_ammount+rak_ammount+tennis_ammount;
        double discount= shose_pric*.2+raket_price*.2+tennis_price*.2;
        Scanner input = new Scanner(System.in);
        System.out.println("**************************Consumption List**********************************");
        System.out.println("Items\t\t\tPrice\tNumber\tAmount\n");
        System.out.println("addidas shoes\t\t$"+shose_pric+"\t\t"+so_number+"\t"+so_ammount);
        System.out.println("tennis racket\t\t$"+raket_price+"\t\t"+rak_number+"\t"+rak_ammount);
        System.out.println(" Kappa tennis\t\t$"+tennis_price+"\t\t"+tennis_number+"\t"+tennis_ammount);
        System.out.println("Total Ammount: "+amount);
        System.out.println("Discount 20% :"+discount);
        System.out.println("Ammount after Discount: "+(amount-discount));
        System.out.print("Money Give to cashier: $");
        double money=input.nextDouble();
        System.out.println("Change: $"+(money-(amount-discount)));
        System.out.println("Point gained from this purchase are : "+(amount- discount)/100*3);
        System.out.println("");
        System.out.println("Please press 'n' to entre the previous manu: ");
        input.close();
        return ;
    }
}