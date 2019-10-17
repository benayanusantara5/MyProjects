
public abstract class Animal {

	private String animalName;
	private int animalLifespan;
	private String animalVore;
	
	public abstract void makeSound();
	
	public abstract void eat();
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String animalName, int animalLifespan, String animalVore) {
		super();
		this.animalName = animalName;
		this.animalLifespan = animalLifespan;
		this.animalVore = animalVore;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getAnimalLifespan() {
		return animalLifespan;
	}

	public void setAnimalLifespan(int animalLifespan) {
		this.animalLifespan = animalLifespan;
	}

	public String getAnimalVore() {
		return animalVore;
	}

	public void setAnimalVore(String animalVore) {
		this.animalVore = animalVore;
	}

	
}
