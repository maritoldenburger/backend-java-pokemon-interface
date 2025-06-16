import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private final String type = "electric";
    List<String> attacks = Arrays.asList("Thunder Punch", "Electro Ball", "Thunder", "Volt Tackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Thunder Punch!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            case "fire":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            case "grass":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            case "water":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Electro Ball!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            case "fire":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            case "grass":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "water":
                System.out.println(enemy.getName() + " loses 100 hp");
                enemy.setHp(enemy.getHp() - 100);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void thunder(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Thunder!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " gains 25 hp");
                enemy.setHp(enemy.getHp() + 25);
            case "fire":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            case "grass":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            case "water":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
        System.out.println(name.getName() + " has " + name.getHp() + " hp left");
    }

    public void voltTackle(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Volt Tackle!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            case "fire":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            case "grass":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "water":
                System.out.println(enemy.getName() + " loses 100 hp");
                enemy.setHp(enemy.getHp() - 100);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    List<String> getAttacks() {
        return attacks;
    }
}
