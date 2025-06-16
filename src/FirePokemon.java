public class FirePokemon extends Pokemon {
    private final String type = "Fire";

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name,level, hp, food, sound, type);
    }
}
