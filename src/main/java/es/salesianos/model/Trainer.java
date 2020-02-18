package es.salesianos.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Trainer {

	@Autowired
	private InterfacePokeball pokeball;

	private static Logger log = LogManager.getLogger(Trainer.class);
	
	private String name;
	private Pokemon pokemon;
	private List <Pokemon> pokemons_team= new ArrayList<Pokemon>();
	private List <Pokemon> pokemons_captured= new ArrayList<Pokemon>(); 

	public Trainer() {
	
	}
	
	
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
		if(this.pokemons_team.size() >= 7) {
			log.debug("No se puede insertar mas pokemons al equipo");
			pokemons_team.remove(0);
		}
	}
	public void addPokemons_captured(Pokemon pokemons) {
		this.pokemons_captured.add(pokemons);
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
