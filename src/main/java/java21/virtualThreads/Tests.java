package java21.virtualThreads;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Tests {
	public static void main(String[] args){
		
		// Start the timer
		long startTime = System.currentTimeMillis();
		
		// Task you want to measure
		try(var executor = Executors.newVirtualThreadPerTaskExecutor()) {
			IntStream.rangeClosed(1, 1000000).forEach(i -> {
				executor.submit(() -> {
					System.out.println(i);
					try {
						Thread.sleep(Duration.ofSeconds(1));
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				});
			});
		}
		
		// End the timer
		long endTime = System.currentTimeMillis();
		
		// Calculate the elapsed time
		long elapsedTime = endTime - startTime;
		
		System.out.println("Task completed in: " + elapsedTime + " milliseconds");
		
		
		
		

	}
}
