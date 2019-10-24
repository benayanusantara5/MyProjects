
public abstract class Fish implements Eggable, Meatable{
	
	private Integer Quantity;
	
	public Fish(Integer quantity) {
		super();
		Quantity = quantity;
	}

	public void getFish(String get) {
		if(get.equals("Egg"))getEggs();
		else if(get.equals("Meat"))getMeat();
	}

	public Integer getQuantity() {
		return Quantity;
	}

	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}

	
}
