public class Hero {
    private String name;
    private int health;
    public int damage;
    private String superpower;
    public Hero(String theName, int theHealth, int theDamage, String theSuperpower) {
        this.name = theName;
        this.health = theHealth;
        this.damage = theDamage;
        this.superpower = theSuperpower;
    }

    public Hero(String theName, int theHealth, int theDamage) {
        this.name = theName;
        this.health = theHealth;
        this.damage = theDamage;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}
