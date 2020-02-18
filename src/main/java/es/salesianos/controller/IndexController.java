package es.salesianos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import es.salesianos.model.Pokemon;
import es.salesianos.model.Trainer;


@Controller
public class IndexController {
	
	@Autowired
	private Trainer trainer;
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("trainer",trainer);
		return modelAndView;
	}

	
	@PostMapping("insert")
	public ModelAndView trainerInsert(Trainer trainerForm) {	
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("trainer", trainer);
		return modelAndView;
	}
	
	@PostMapping("insertPokemon")
	public ModelAndView pokemonInsert(Trainer trainerForm) {
		
		ModelAndView modelAndView = new ModelAndView("index");
		Pokemon pokemon =  new Pokemon();

		pokemon.setName(trainerForm.getPokemon().getName());
		pokemon.setHealth(trainerForm.getPokemon().getHealth());
		pokemon.setAttack(trainerForm.getPokemon().getAttack());
		
		trainer.addPokemons(pokemon);
		modelAndView.addObject("ListPokemons", trainer.getPokemons());
		return modelAndView;
	}

}
