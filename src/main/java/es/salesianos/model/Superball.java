package es.salesianos.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//Superball
@Component
@Profile("Superball")
public class Superball extends AbstractPokeball {

	public Superball() {
		setName("Superball");
		setProbability(25);
	}
}
