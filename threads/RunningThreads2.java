package threads;
import java.util.concurrent.ScheduledThreadPoolExecutor;

import java.util.concurrent.TimeUnit;

public class RunningThreads2 {

	public static void main(String[] args) {
		//we won't be using sleep() method, but instead we will be using predefined time schedules
		//we can call the threads outside our main methods
		
		addThreadsToPool();
		
	}

	public static void addThreadsToPool() {
		
		ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
		
		eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, TimeUnit.SECONDS);
		
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, TimeUnit.SECONDS);
		
		eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"), 10, 10, TimeUnit.SECONDS);
		
		System.out.println("Number of Threads: " + Thread.activeCount());
		//We get count 4, but we created only 3 threads, what is the 4th thread?
		
		
		//Do the following to print the all the threads.
		
		Thread[] listOfThreads = new Thread[Thread.activeCount()];
		
		Thread.enumerate(listOfThreads);
		
		for(Thread i : listOfThreads){
			System.out.println(i.getName()); 
		}
		
		//Check the priority of the threads
		for(Thread i : listOfThreads){
			System.out.println(i.getPriority());
		}
		
		// Set priority of the threads using threadName.setPriority() --> 10 is MAX and 0 is MIN
		
		//We don't want to run indefinitely this will allow the threads to run for 20 seconds
		
		/*try{
			Thread.sleep(20000);
		}
		catch(InterruptedException e){
			
		}*/
		
		// Shuts down all threads in the pool
		eventPool.shutdown();
	} 
	
}
