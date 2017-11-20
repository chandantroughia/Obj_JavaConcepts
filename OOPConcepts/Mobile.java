package OOPConcepts;

public class Mobile {
	private String manufacturer;
	private String os;
	protected String model;
	private long cost;
	//Constructor
	public Mobile(String man, String os, String mod, int c){
		this.cost = c;
		this.manufacturer = man;
		this.model = mod;
		this.os = os;
	}
	//method to get the model
	public String getModel(){
		return model;
	}
}
