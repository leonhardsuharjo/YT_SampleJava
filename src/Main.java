public class Main {

    public static void main(String[] args)  {

        Inventory inventory = new Inventory();

        /*
        Item item1 = new Item("Apples", 20);
        Item item2 = new Item("Sword ", 2);
        */
        Item item = new Item( "Generic Item", 10);
        Fruit fruit = new Fruit("Apple", 20,  "Fuji");

        inventory.addItem(item);
        inventory.addItem(fruit);

        inventory.displayInventory();
    }


}