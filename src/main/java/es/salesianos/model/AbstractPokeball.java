package es.salesianos.model;

public abstract class AbstractPokeball implements InterfacePokeball {

	private String name;
	private int probability;
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getProbability() {
		return probability;
	}
	
	public void setProbability(int probability) {
		this.probability = probability;
	}

}
