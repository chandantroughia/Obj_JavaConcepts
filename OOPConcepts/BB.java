package OOPConcepts;

public class BB extends Mobile{
	
	 public BB(String man, String os, String mod, int c) {
		super(man, os, mod, c);
	}

	
	public String getModel(){
		return "This is BlackBerry Mobile: " + model;
	}
	
}
