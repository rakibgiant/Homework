public class DisplayTheItemName {
    public static void main(String[] args) {
        String [] item_name = new String[5];
        item_name[0]="Nike";
        item_name[1]="adidas";
        item_name[2]="puma";
        item_name[3]="kappa";
        item_name[4]="360";
        for(int i=0;i<item_name.length;i++)    //length is the property of the array  
        System.out.println(item_name[i]);
    }

}