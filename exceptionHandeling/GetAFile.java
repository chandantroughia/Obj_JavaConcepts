package exceptionHandeling;
import java.io.*;

public class GetAFile {
	
	public static void main(String[] args) {
		getAfile("./somestuff.txt");
	}

	public static void getAfile(String fileName) {
		
		try{
			FileInputStream file  = new FileInputStream(fileName);
		}
		catch(FileNotFoundException e){
			System.out.println("Sorry can't find that file.");
		}
		
		catch(IOException e){
			System.out.println("Unknown IO Error.");
		}
		
		catch(Exception e){
			System.out.println("Some error occure.");
		}
		
		finally{
			System.out.println("I am finally, I always get executed.");
		}

	} 
	

}
