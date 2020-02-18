package es.salesianos.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//Masterball
@Component
@Profile("Masterball")
public class Masterball extends AbstractPokeball {

	public Masterball() {
		setName("Masterball");
		setProbability(100);
	}
}
