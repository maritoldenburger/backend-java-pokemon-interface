import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    private final String type = "water";
    List<String> attacks = Arrays.asList("Surf", "Hydro Pump", "Hydro Canon", "Rain Dance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Surf!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            case "fire":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "grass":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            case "water":
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Hydro Pump!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "fire":
                System.out.println(enemy.getName() + " loses 100 hp");
                enemy.setHp(enemy.getHp() - 100);
            case "grass":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            case "water":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Hydro Canon!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            case "fire":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "grass":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            case "water":
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Rain Dance!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println("has no effect on " + enemy.getName());
            case "fire":
                System.out.println(enemy.getName() + " loses 100 hp");
                enemy.setHp(enemy.getHp() - 100);
            case "grass":
                System.out.println(enemy.getName() + " gains 25 hp");
                enemy.setHp(enemy.getHp() + 25);
            case "water":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    List<String> getAttacks() {
        return attacks;
    }
}
