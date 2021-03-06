package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class Pokemon {
	private String name;
	private String health;
	private String attack;
	private boolean currentFighter;
	private boolean wild;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHealth() {
		return health;
	}
	
	public void setHealth(String health) {
		this.health = health;
	}
	
	public String getAttack() {
		return attack;
	}
	
	public void setAttack(String attack) {
		this.attack = attack;
	}

	public boolean isCurrentFighter() {
		return currentFighter;
	}

	public void setCurrentFighter(boolean currentFighter) {
		this.currentFighter = currentFighter;
	}

	public boolean isWild() {
		return wild;
	}

	public void setWild(boolean wild) {
		this.wild = wild;
	}

}
