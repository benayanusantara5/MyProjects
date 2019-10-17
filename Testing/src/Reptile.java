
public class Reptile extends Animal{

	private int eggCount;
	
	public Reptile() {
		// TODO Auto-generated constructor stub
	}

	public Reptile(String animalName, int animalLifespan, String animalVore, int eggCount) {
		super(animalName, animalLifespan, animalVore);
		this.eggCount = eggCount;
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Hiss");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		if(getAnimalVore().equals("Carnivore"))System.out.println("Eating Meat");
		else if(getAnimalVore().equals("Herbivore"))System.out.println("Eating Salad");
		else System.out.println("Eats Everything");
	}

	public int getEggCount() {
		return eggCount;
	}

	public void setEggCount(int eggCount) {
		this.eggCount = eggCount;
	}

	
	
}
