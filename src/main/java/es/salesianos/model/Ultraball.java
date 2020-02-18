package es.salesianos.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//Masterball
@Component
@Profile("Ultraball")
public class Ultraball extends AbstractPokeball {

	public Ultraball() {
		setName("Ultraball");
		setProbability(50);
	}
}
