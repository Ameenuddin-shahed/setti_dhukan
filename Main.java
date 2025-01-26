import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Tax categories: ");
        int Tax_categories = sc.nextInt();
        int[] GST = new int[Tax_categories];
        for (int L = 0; L < Tax_categories; L++) {
            System.out.print("Tax rate of C" + (L + 1) + " : ");
            GST[L] = sc.nextInt();
        }

        
        System.out.print("Enter Number of products: ");
        int Number_of_products = sc.nextInt();
        System.out.println("Enter details in format of product_name, GST_Category, Unit_price:");

        String[] product_name = new String[Number_of_products];
        int[] category = new int[Number_of_products];
        int[] unit_price = new int[Number_of_products];

        for (int i = 0; i < Number_of_products; i++) {
            product_name[i] = sc.next(); 
            category[i] = sc.nextInt() -1;
            unit_price[i] = sc.nextInt();
        }

        
        System.out.print("Enter number of customers in the queue: ");
        int queue = sc.nextInt();
        for (int i = 1; i <= queue; i++) {
            System.out.print("Enter the number of items in customer " + i + " basket: ");
            int Number_of_units = sc.nextInt();
            double total_bill = 0 , bill = 0, total_price = 0, total_gst = 0; 
            System.out.print("Enter customer "+ i+" purchased items in item_name, quantity : \n");

            double max_item_price = 0;
            int max_item_index = -1;
            double max_item_original_price = 0;

            
            for (int j = 0; j < Number_of_units; j++) {
                String item_name = sc.next();
                int quantity = sc.nextInt();

           
                for (int k = 0; k < Number_of_products; k++) {
                    if (product_name[k].equals(item_name)) {
                        double price = unit_price[k] * quantity;
                        double tax = price * GST[category[k]] / 100;
                        bill = price + tax;
                        total_price = total_price + price;
                        total_gst = total_gst + tax;
                        
                        System.out.println(item_name + " - Total units - "+ quantity + " - price = " +price+ " GST = "+tax+ " Total = "+bill);

                        total_bill = total_bill + bill;

                   
                        if (price > max_item_price) {
                            max_item_price = price;
                            max_item_index = k;
                            max_item_original_price = price;
                        }
                        break;
                    }
                }
            }

            
            if (max_item_index != -1 && Number_of_units > 1) {
                double discount = 0.05 * max_item_original_price;
                if (discount > 200) discount = 200;
                total_bill = total_bill - discount;
                System.out.println("Applied 5% discount on " + product_name[max_item_index] + " worth " + max_item_original_price + " - Discount: " + discount);
            }

            System.out.println("Total price = "+total_price+ " Total GST = "+(Math.round(total_gst*10.0)/10.0) + " Final price = " +(Math.round(total_bill*10.0)/10.0));
        }
    }
}