public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(95);
        boss.setProtectionType("Physical");
        System.out.println("Boss info: " + boss.getHealth() + " " + boss.getDamage() + " " + boss.getProtectionType());
        Hero[] heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getName() + " info: " + heroes[i].getHealth() + " " + heroes[i].getDamage() + " " + heroes[i].getSuperability());
        }

    }

    public static Hero[] createHeroes() {
        Hero Tank = new Hero(1000, 50, "Protection", "Tank");
        Hero Berserk = new Hero(100, 500,"Berserk");
        Hero Leon = new Hero(150, 150, "Without erroneous coding", "Leon");
        Hero[] heroesArray = new Hero[3];
        heroesArray[0] = Tank;
        heroesArray[1] = Berserk;
        heroesArray[2] = Leon;
        return heroesArray;

    }
}

