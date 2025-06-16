import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    private static String type = "grass";
    List<String> attacks = Arrays.asList("Leaf Storm", "Solar Beam", "Leech Seed", "Leave Blade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leaf Storm!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "fire":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            case "grass":
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            case "water":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Solar Beam!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 100 hp");
                enemy.setHp(enemy.getHp() - 100);
            case "fire":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "grass":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            case "water":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leech Seed!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 50 hp");
                System.out.println(name.getName() + " gains 50 hp");
                enemy.setHp(enemy.getHp() - 50);
                name.setHp(name.getHp() + 50);
            case "fire":
                System.out.println(enemy.getName() + " loses 25 hp");
                System.out.println(name.getName() + " gains 25 hp");
                enemy.setHp(enemy.getHp() - 25);
                name.setHp(name.getHp() + 25);
            case "grass":
                System.out.println(enemy.getName() + " loses 5 hp");
                System.out.println(name.getName() + " gains 5 hp");
                enemy.setHp(enemy.getHp() - 5);
                name.setHp(name.getHp() + 5);
            case "water":
                System.out.println(enemy.getName() + " loses 10 hp");
                System.out.println(name.getName() + " gains 10 hp");
                enemy.setHp(enemy.getHp() - 10);
                name.setHp(name.getHp() + 10);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Leave Blade!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 100 hp");
                enemy.setHp(enemy.getHp() - 100);
            case "fire":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "grass":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            case "water":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    List<String> getAttacks() {
        return attacks;
    }
}
