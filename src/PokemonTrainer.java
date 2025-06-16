import java.util.List;

public class PokemonTrainer {
    private String name;
    private List<Pokemon> pokemonList;

    public PokemonTrainer (String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemonList = pokemons;
    }
}
