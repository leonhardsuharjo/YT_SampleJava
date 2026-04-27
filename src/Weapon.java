public class Weapon extends Item{
    private int damange;
    private String type;

    public Weapon(String name, int quantity, int damage, String type) {
        super(name, quantity); // pull in attributes that are inherited from item
        this.damage = damage;
        this.type = type;
    }

    public int getDamage(){
        return damage;
    }

    public String getType(){
        return type;
    }
}
