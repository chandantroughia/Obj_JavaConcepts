package OOPConcepts;

public class VehicleAbstract {
	
	public void start() {
	}
	public void stop(){
		System.out.println("Stopping Vehicle in abstract class");
	}

}

 class TwoWheeler extends VehicleAbstract{
	//override
	public void start() {  
        System.out.println("Starting Two Wheeler");       
   }
}

class FourWheeler extends VehicleAbstract{  
    @Override  
    public void start() {  
        System.out.println("Starting Four Wheeler");  
    }  
}
