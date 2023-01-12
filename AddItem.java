
/**
 * Final Project
 * Hoang Barney
 * Note the list and calculate the total of price
 */
public class AddItem 
{
    private String itemName;
    private double itemPrice;
    private int itemQty;
    
    
public String getitemName() {
    return itemName;
}

public double getitemPrice() {
    return itemPrice;
}

public int getitemQty() {
    return itemQty;
}

public void setitemName(String itemName)
{
    this.itemName = itemName;
}

    public void setitempPrice(double itemPrice)
{
    this.itemPrice = itemPrice;
}

    public void setitemQty(int itemQty)
{
    this.itemQty = itemQty;
}

public String toString()
{
    String list = itemName + " : $" + itemPrice + " x " + itemQty + " = $" + (itemPrice * itemQty);
    return list;
}
public AddItem(String itemName, double itemPrice, int itemQty )
{
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQty = itemQty;

}

}