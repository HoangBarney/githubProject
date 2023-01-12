
/**
 * Final Project
 * Hoang Barney
 */
import java.util.Scanner;
import java.util.ArrayList;
public class NoteList implements iSay{

    ArrayList<AddItem> list = new ArrayList<>();
    
     public void addItem()
       { 
            System.out.println("Enter the name of the item");
            Scanner input = new Scanner(System.in);
            String itemName = input.nextLine();

            System.out.println("Enter the price of this item");
            double itemPrice = input.nextDouble();

            System.out.println("Enter the quantity of item");
            int itemQty = input.nextInt();
            AddItem Item = new AddItem(itemName, itemPrice,itemQty);
            list.add(Item);
            System.out.println("This Item Added");
       }

    public void AllList(){
             for (int counter = 0; counter < list.size(); counter++) {
                 System.out.println(list.size() + " " + "items");

                 System.out.println(list.toString());
                }
             }
        
    public void Say()
       {
           System.out.println("Thank you for using this adding list. Have a great day!");
       }
    
 }