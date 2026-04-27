public class Fruit extends Item {
    private String type;

    public Fruit(String name, int quantity, String type) {
        super(name, quantity); //assign values being passed as parameters imported from the SUperclass
        this.type = type;
    }
}
