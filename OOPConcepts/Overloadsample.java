package OOPConcepts;


//Static Polymorphism (compile time polymorphism/ Method overloading):
public class Overloadsample{
	
	public void print(String s){
		System.out.println("First Method with only String- "+ s);
	}
	
	public void print(int i){  
        System.out.println("Second Method with only int- "+ i);  
    }  
    public void print(String s, int i){  
        System.out.println("Third Method with both- "+ s + "--" + i);  
    } 
    
    @Override
    public boolean equals(Object obj){
		return false;
    	
    }
}
