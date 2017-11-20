package OOPConcepts;

//Dynamic Polymorphism (run time polymorphism/ Method Overriding)
public class OverridingDemo {
	
	public static void main(String[] args) {
		Mobile m = new Mobile("Nokia", "Win8", "Lumia",10000);  
        System.out.println(m.getModel());  
        //Creating Object of Sublcass and calling getModel Method  
        Android a = new Android("Samsung", "Android", "Grand",30000);  
        System.out.println(a.getModel());  
        //Creating Object of Sublcass and calling getModel Method  
        BB b = new BB("BlackB", "RIM", "Curve",20000);  
        System.out.println(b.getModel());
	}

}
