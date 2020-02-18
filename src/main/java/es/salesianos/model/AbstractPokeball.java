package es.salesianos.model;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class AbstractPokeball implements InterfacePokeball {

	private static Logger log = LogManager.getLogger(Trainer.class);
	
	private String name;
	private int probability;
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getProbability() {
		return probability;
	}
	
	public void setProbability(int probability) {
		this.probability = probability;
	}
	public void catchPokemon(Pokemon pokemon, Trainer team) {
		Random random = new Random();
		int chance = random.nextInt(59)+1;
		if(chance <= probability) {	
			team.addPokemons(pokemon);
			team.addPokemons_captured(pokemon);
			if(team.getPokemons().size() < 6) {
				log.debug("Has capturado a " + pokemon.getName() + "!");
			}else {
				log.debug("Tu equipo esta lleno");
			}
		}else {
			log.debug("El pokemon salvaje ha escapado");
		}
	}

}
