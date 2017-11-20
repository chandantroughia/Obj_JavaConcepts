package OOPConcepts;

public class Android extends Mobile{
	//constructor for Android
	Android(String man, String os, String mod, int c){
		super(man, os, mod, c);
	}
	
	public String getModel(){
		return "This is Android Mobile: " + model;
	}
}
