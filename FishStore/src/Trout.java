
public class Trout extends Fish{

	public Trout(Integer quantity) {
		super(quantity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getEggs() {
		System.out.println("Get "+getQuantity()+" Trout Eggs");
	}

	@Override
	public void getMeat() {
		System.out.println("Get "+getQuantity()+" Trout Meat");
	}
}
