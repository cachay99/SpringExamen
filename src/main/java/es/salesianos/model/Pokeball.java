package es.salesianos.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//Pokeball normal
@Component
@Profile("Pokeball")
public class Pokeball extends AbstractPokeball {

	public Pokeball() {
		setName("Pokeball");
		setProbability(10);
	}
}
