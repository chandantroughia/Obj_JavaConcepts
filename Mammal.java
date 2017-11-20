
public class Mammal implements Animal {

	public void eat(){
		System.out.println("Mammal eats.");
	}
	
	public void travel(){
		System.out.println("Mammal travels");
	}
	
	public int numberOfLegs(){
		return 0;
	}
	
	public static void main(String[] args) {
		Mammal newMammal = new Mammal();
		newMammal.eat();
		newMammal.travel();
		
	}
	
}
