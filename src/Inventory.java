import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items; // DECLARING arraylist

    public Inventory(){
        items = new ArrayList<>(); // ASSIGNING an arraylist
    }

    public void addItem(Item item) { // Item != item
        items.add(item);
    }

    public void displayInventory(){
        for (Item item : items ){
            System.out.println("Item: " + item.getName() + ", Quantity: " +item.getQuantity());
        }
    }
}

