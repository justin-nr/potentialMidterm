public class Character {
    private String name;
    private String location;
    private int hp;
    private int attack;
    private final int max_hp = 100;

    public Character(String name, String location) {
        this.name = name;
        this.location = location;
        this.hp = max_hp;
        this.attack = 15;
    }

    public void move(String newLocation) {
        this.location = newLocation;
    }

    //getter for hp
    public int getHP() {
        return hp;
    }

    //method to take damage
    public void takeDamage(int amount) {
        hp = Math.max(0, hp - amount);
    }

    //getter method for location
    public String getLocation() {
        return this.location;
    }

    //getter method for name
    public String getName() {
        return this.name;
    }
}

