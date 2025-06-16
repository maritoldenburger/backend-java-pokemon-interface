import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private final String type = "fire";
    List<String> attacks = Arrays.asList("Fire Lash", "Flame Thrower", "Pyro Ball", "Inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Fire Lash!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            case "fire":
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            case "grass":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "water":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Flame Thrower!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "fire":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            case "grass":
                System.out.println(enemy.getName() + " loses 100 hp");
                enemy.setHp(enemy.getHp() - 100);
            case "water":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Pyro Ball!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 25 hp");
                enemy.setHp(enemy.getHp() - 25);
            case "fire":
                System.out.println(enemy.getName() + " loses 5 hp");
                enemy.setHp(enemy.getHp() - 5);
            case "grass":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "water":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
        }
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with Inferno!");
        switch (enemy.getType()) {
            case "electric":
                System.out.println(enemy.getName() + " loses 50 hp");
                enemy.setHp(enemy.getHp() - 50);
            case "fire":
                System.out.println(enemy.getName() + " loses 10 hp");
                enemy.setHp(enemy.getHp() - 10);
            case "grass":
                System.out.println(enemy.getName() + " loses 100 hp");
                enemy.setHp(enemy.getHp() - 100);
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
