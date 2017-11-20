package exceptionHandeling;
import java.io.*;

public class Throws {
	
	public static void main(String[] args) {
		
		try{
			getAFile("./some.txt");
		}
		catch(IOException e){
			System.out.println("An IO Error Occured.");
		}
		
	}
	
	public static void getAFile(String fileName) throws IOException, FileNotFoundException{
		
		FileInputStream file = new FileInputStream(fileName);
		
	}

}
