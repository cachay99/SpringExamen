package es.salesianos.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import es.salesianos.model.AbstractPokeball;
import es.salesianos.model.Pokemon;
import es.salesianos.model.Trainer;


@Controller
public class IndexController {
	
	private static Logger log = LogManager.getLogger(IndexController.class);
	
	@Autowired
	private Trainer trainer;
	
	@Autowired
	private AbstractPokeball pokeball;
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("trainer", this.trainer);
		return modelAndView;
	}

	
	@PostMapping("insert")
	public ModelAndView trainerInsert(Trainer trainerForm) {
		log.debug("trainerInsert:" + this.trainer.toString());		
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("trainer", trainer);
		return modelAndView;
	}
	
	@PostMapping("insertPokemon")
	public ModelAndView pokemonInsert(Trainer trainerForm) {
		log.debug("pokemonInsert:" + this.trainer.toString());	
		
		ModelAndView modelAndView = new ModelAndView("index");
		Pokemon pokemon =  new Pokemon();

		pokemon.setName(trainerForm.getPokemon().getName());
		pokemon.setHealth(trainerForm.getPokemon().getHealth());
		pokemon.setAttack(trainerForm.getPokemon().getAttack());
		
		trainer.addPokemons(pokemon);
		modelAndView.addObject("trainer", trainer);
		return modelAndView;
	}
	
}
