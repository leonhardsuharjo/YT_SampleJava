import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items; // DECLARING arraylist

    public Inventory(){
        items = new ArrayList<>(); // ASSIGNING an arraylist
    }

    public void addItem(Item item) { // Item != item
        items.add(item);
    }

    public void addItem(String name, int quantity, String type){
        items.add(new Fruit(name, quantity, type));
    }

    public void addItem(String name, int quantity, String type){
        items.add(new weapon());
    }


    public void displayInventory(){
        for (Item item : items ){
            System.out.println("Item: " + item.getName() + ", Quantity: " +item.getQuantity());
            System.out.println("Item: " + item.toString());
        }
    }
}

