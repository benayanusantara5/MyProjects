
public class Mammal extends Animal{

	private int babyCount;
	
	public Mammal() {
		// TODO Auto-generated constructor stub
	}

	
	public Mammal(String animalName, int animalLifespan, String animalVore, int babyCount) {
		super(animalName, animalLifespan, animalVore);
		this.babyCount = babyCount;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		if(getAnimalVore().equals("Carnivore"))System.out.println("Eating Meat");
		else if(getAnimalVore().equals("Herbivore"))System.out.println("Eating Salad");
		else System.out.println("Eats Everything");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Moo");
	}


	public int getBabyCount() {
		return babyCount;
	}


	public void setBabyCount(int babyCount) {
		this.babyCount = babyCount;
	}
	
	
	
}
