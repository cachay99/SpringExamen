package es.salesianos.model;

import org.springframework.stereotype.Component;

@Component
public class Pokemon {
	private String name;
	private String health;
	private String attack;

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

}
