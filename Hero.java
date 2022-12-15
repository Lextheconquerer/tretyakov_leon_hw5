public class Hero {private int health;

    private int damage;

    private String superability;


    private String name;

    public Hero(int health, int damage, String superability, String name){
        this.health = health;
        this.damage = damage;
        this.superability = superability;
        this.name = name;

    }
    public Hero(int health, int damage, String name){
        this.health = health;
        this.damage = damage;
        this.name = name;


    }
    public int getHealth (){
        return health;
    }
    public int getDamage (){
        return damage;
    }
    public String getSuperability (){
        return  superability;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}

