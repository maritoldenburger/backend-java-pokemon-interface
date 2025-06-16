import java.util.List;

public class PokemonTrainer {
    private String name;
    private List<Pokemon> pokemonList;

    public PokemonTrainer(String name, List<Pokemon> pokemons) {
        this.name = name;
        this.pokemonList = pokemons;
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemons) {
        this.pokemonList = pokemons;
    }
}
