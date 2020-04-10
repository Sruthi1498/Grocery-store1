package grocery;

import java.util.*;

class Item {

    String Name;
    double price;
    double quan;
    public Item(String Name, double price,double quan) {
        this.Name = Name;
        this.price = price;
        this.quan = quan;
       
    }
}
public class Grocery{
    public static void Grocery() {
        Scanner scan = new Scanner (System.in);
        String Name;
        Double Price;
        String more;
        Double quan;
        
        ArrayList<Item> array = new ArrayList<>();

      
            do {
               
                System.out.println("name of the item?");
                Name = scan.next();
                System.out.println("price of the item?");
                Price = scan.nextDouble();
                System.out.println("quantity of the item?");
                quan = scan.nextDouble();
                System.out.println("more items?");
                more = scan.next();

                array.add(new Item(Name,Price,quan));

                } while (more.equals("yes"));
        }
                      
    private static void Bill(ArrayList<Item> items) {
        double total = 0.00;
        double pri=0;
       
        System.out.println("*************** GROCERY BILL ***************");

        System.out.println("***** ITEM NAME ***** ITEM PRICE ***** QUANTITY ***** ");

        for (Item item : items) {
            pri=item.quan*item.price;
            System.out.printf("        %s              %.2f              %.2f        \n", item.Name, item.price,pri);
             
            total += pri;
        }

        System.out.println("****************************************************");
        System.out.println("Total :" + total);
    }
}





