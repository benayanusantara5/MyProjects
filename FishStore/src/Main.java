import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	public Main(){
		int input;
		
		do{
			System.out.println("Fish Store");
			System.out.println("==========");
			System.out.println("1.Trout");
			System.out.println("2.Shark");
			System.out.print("Choose: ");
			try {
				input = scan.nextInt();
			} catch (Exception e) {
				input = -1;
				System.out.println("Input must be a number");
			}
			scan.nextLine();
			
			String eggOrmeat;
			Integer quantity;
			Fish fish;
			
			switch(input){
			case 1:
				
				do{
					System.out.print("Input type [Meat|Egg]:");
					eggOrmeat = scan.nextLine();
				}while(!eggOrmeat.equals("Egg") && !eggOrmeat.equals("Meat"));
				
				do{
					System.out.print("Input quantity [1-10]:");
					try {
						quantity = scan.nextInt();
					} catch (Exception e) {
						quantity = -1;
					}
					scan.nextLine();
				}while(quantity<1 || quantity >10);
				
				fish = new Trout(quantity);
				fish.getFish(eggOrmeat);
				break;
			case 2:
				do{
					System.out.print("Input type [Meat|Egg]:");
					eggOrmeat = scan.nextLine();
				}while(!eggOrmeat.equals("Egg") && !eggOrmeat.equals("Meat"));
				
				do{
					System.out.print("Input quantity [1-10]:");
					try {
						quantity = scan.nextInt();
					} catch (Exception e) {
						quantity = -1;
					}
					scan.nextLine();
				}while(quantity<1 || quantity >10);
				
				fish = new Shark(quantity);
				fish.getFish(eggOrmeat);
				break;
			}
		}while(true);
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
