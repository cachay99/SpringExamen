package es.salesianos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import es.salesianos.model.AbstractPokeball;
import es.salesianos.model.Pokemon;
import es.salesianos.model.Trainer;


@Controller
public class IndexController {

	@Autowired
	private Trainer trainer;
	@Autowired
	private Pokemon pokemon;
	@Autowired
	private AbstractPokeball pokeball;

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		addAllObjects(modelAndView);
		return modelAndView;
	}

	public void addAllObjects(ModelAndView modelAndView) {
		modelAndView.addObject("trainer", this.trainer);
		modelAndView.addObject("pokemon", this.pokemon);
	}

	@PostMapping("insert")
	public ModelAndView trainerInsert(@ModelAttribute("trainer") Trainer trainerForm) {	
		ModelAndView modelAndView = new ModelAndView("index");	
		addPageDataTrainer(trainerForm);
		addAllObjects(modelAndView);
		return modelAndView;
	}

	private void addPageDataPokemon(Pokemon pokemonForm) {
		if (!StringUtils.isEmpty(pokemonForm.getName())) {
			pokemon.setName(pokemonForm.getName());
		}

		if (!StringUtils.isEmpty(pokemonForm.getHealth())) {
			pokemon.setHealth(pokemonForm.getHealth());
		}

		if (!StringUtils.isEmpty(pokemonForm.getAttack())) {
			pokemon.setAttack(pokemonForm.getAttack());
		}
		if (!StringUtils.isEmpty(pokemonForm.isCurrentFighter())) {
			pokemon.setCurrentFighter(false);
		}
	}

	private void addPageDataTrainer(Trainer trainerForm) {
		if (!StringUtils.isEmpty(trainerForm.getName())) {
			trainer.setName(trainerForm.getName());
		}

	}
	@PostMapping(path = "/event", params = {"capture"})
	public ModelAndView pokemonCapture(@ModelAttribute("pokemon") Pokemon poke) {	
		ModelAndView modelAndView = new ModelAndView("index");
		addPageDataPokemon(poke);
		pokeball.catchPokemon(poke, trainer);
		addAllObjects(modelAndView);
		return modelAndView;
	}
}
