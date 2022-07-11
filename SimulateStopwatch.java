package org.bridge.git;

import java.util.Scanner;

public class SimulateStopwatch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start to run the stopwatch ");
		String string = sc.next();

		long startTime = 0; 
	    long endTime = 0;

		if (string.equals("start")) {
			System.out.println("Stop watch started");

			startTime = System.currentTimeMillis();
			Thread.sleep(5000);

			System.out.println("Enter end to stop the stop watch");
			string = sc.next();
			if (string.equals("end")) {
				System.out.println("Stop watch ended");

				endTime = System.currentTimeMillis();

				long diffTime = endTime - startTime;

				int hours = (int) diffTime / (1000 * 60 * 60);
				int minutes = (int) diffTime / (1000 * 60);
				int seconds = (int) diffTime / 1000;
				int milliSeconds = (int) diffTime % 1000;

				System.out.println(hours + "," + minutes + "," + seconds + "," + milliSeconds);
			} else {
				System.out.println("Invalid input");
			}
		} else {
			System.out.println("Invalid input");
		}
	}

}
