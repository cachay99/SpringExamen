package es.salesianos.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Trainer {

	@Autowired
	private AbstractPokeball pokeball;

	private String name;
	private Pokemon pokemon;
	private List <Pokemon> pokemons= new ArrayList<Pokemon>(); 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List <Pokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(List <Pokemon> pokemons) {
		this.pokemons = pokemons;
	}

	public void addPokemons(Pokemon pokemons) {
		this.pokemons.add(pokemons);
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public AbstractPokeball getPokeball() {
		return pokeball;
	}

	public void setPokeball(AbstractPokeball pokeball) {
		this.pokeball = pokeball;
	}
}