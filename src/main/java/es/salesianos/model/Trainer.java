package es.salesianos.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Trainer {

	@Autowired
	private InterfacePokeball pokeball;

	private String name;
	private Pokemon pokemon;
	private List <Pokemon> pokemons_team= new ArrayList<Pokemon>();
	private List <Pokemon> pokemons_captured= new ArrayList<Pokemon>(); 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List <Pokemon> getPokemons() {
		return pokemons_team;
	}

	public void setPokemons(List <Pokemon> pokemons) {
		this.pokemons_team = pokemons;
	}

	public void addPokemons(Pokemon pokemons) {
		this.pokemons_team.add(pokemons);
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public InterfacePokeball getPokeball() {
		return pokeball;
	}

	public void setPokeball(InterfacePokeball pokeball) {
		this.pokeball = pokeball;
	}

	public List <Pokemon> getPokemons_captured() {
		return pokemons_captured;
	}

	public void setPokemons_captured(List <Pokemon> pokemons_captured) {
		this.pokemons_captured = pokemons_captured;
	}
}
