
public class Shark extends Fish{
	
	public Shark(Integer quantity) {
		super(quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getEggs() {
		System.out.println("Get "+getQuantity()+" Shark Eggs");
	}

	@Override
	public void getMeat() {
		System.out.println("Get "+getQuantity()+" Shark Meat");
	}
}
