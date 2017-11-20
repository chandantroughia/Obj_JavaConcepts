package threads;
import java.util.*;
import java.text.DateFormat;


//All the methods in the Thread class are extended
public class GetTime20 extends Thread{

	public void run(){
		
		Date rightNow;
		Locale currentLocation;
		DateFormat timeFormatter;
		DateFormat dateFormatter;
		String timeOutput;
		String dateOutput;
		
		for(int i = 1; i <= 20; i++){
			rightNow = new Date();
			currentLocation = new Locale("en");
			
			timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocation);
			dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocation);
			
			timeOutput = timeFormatter.format(rightNow);
			dateOutput = dateFormatter.format(rightNow);
			
			System.out.println(timeOutput);
			System.out.println(dateOutput);
			System.out.println();
			
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				
			}
			
		}
		
	}
	
}
