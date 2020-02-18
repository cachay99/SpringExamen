package es.salesianos.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//Masterball
@Component
@Profile("UltraPokeball")
public class UltraPokeball extends AbstractPokeball {

	public UltraPokeball() {
		setName("Ultraball");
		setProbability(50);
	}
}
