package learnenum;

enum Fruit{
	APPLE, BANANA, GUAVA, JACKFRUIT 
}

enum FruitWithPrice{
	APPLE(10), BANANA(5), GUAVA(2), JACKFRUIT(20), Oragne;
	
	private int price;
	FruitWithPrice(){
		price = -1;
	}
	FruitWithPrice(int p){
		price = p ;
	}
	
	int getPrice(){
		return price;
	}
}
public class LearnEnum {
	
	static Fruit[] fr;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fr = Fruit.values();
		FruitWithPrice[] fw = FruitWithPrice.values();
		/*for ( Fruit f : fr){
			System.out.println("Ordinal is " + f.ordinal() + " " + f);
		}*/
		
		for ( FruitWithPrice fwp: fw ){
			System.out.println(fwp + " price is " + fwp.getPrice());
		}

	}

}
