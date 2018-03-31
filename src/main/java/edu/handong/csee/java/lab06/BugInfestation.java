package edu.handong.csee.java.lab06;

import java.util.Scanner;

/**
 * This is BugInfestation class.
 * 
 *
 * @author CUL
 *
 */
public class BugInfestation {		//class name
	private static Scanner keyboard;

	/**
	 * 
	 *This is BugInfestation main class.
	 * In the main class, you get the Volume of your house and the input of the initial bugs.
 	 * when you exceed your home's Volume, you print the number of your bugs.
	 * @param args is main method
	 */
	public static void main(String[] args) {		//main method
		// TODO Auto-generated method stub
		double GROWTH_RATE = 0.95;					//Growth rate of bugs (double type variable)
		double ONE_BUG_VOLUME = 0.002;				//The Volume occupied by a one bug (double type variable)
		double houseVolume;							// house volume is double type variable.
		int startPopulation;						//start population of bugs(integer type variable)
		int countWeeks;								//Count weeks are integer type variable.
		double population;							//population is total number of bugs (double type variable
		double totalBugVolume;						// totalBugVolume is total number of bugs * OneBugVolume (double type variable)
		double newBugs;								// newBugs are the increased bugs.
		double newBugVolume;						// newbugvolume variable declare
		
		keyboard = new Scanner(System.in);
		
		System.out.println("Enter the total volume of your house in cubic feet : ");  	// Print
		houseVolume = keyboard.nextInt();												//scan to houseVolume
		System.out.println("Enter the estimated number of roaches in your house : ");	//print
		startPopulation = keyboard.nextInt();											//scan to startPopulation

		
		population =  startPopulation;				//to calculate
		totalBugVolume = (population * ONE_BUG_VOLUME); //volume = population * onebugvolume
		
		countWeeks = 0;	// count week
		
		while(totalBugVolume < houseVolume) {		// while-loop (totalbugVolume < houseVolume)
			newBugs = (population * GROWTH_RATE);	// newbug is population multiply Growth_rate
			newBugVolume = (newBugs*ONE_BUG_VOLUME);	// new bugvolume is newbug multiply onebugvolume
			population = population + newBugs;		// population is the sum of existing and increased bugs
			totalBugVolume = totalBugVolume + newBugVolume;	// totalbugvolume is the sum of existing and increased bugVolume	
			countWeeks = countWeeks + 1;	//countweek = countweek+1
			
		} 
		
		System.out.println("Starting with a roach population of " + startPopulation +" and a house with a volume of " + houseVolume + " cubic feet, after "+countWeeks+" weeks,"); //print initial condition

		System.out.println("The house will be filled with " + (int)(population) +" roaches."); // print last population
		System.out.println("They will fill a volume of " + (int) totalBugVolume+" cubic feet."); //print last bug volume
		System.out.println("Better call Debugging Experts Inc.");  // print
		
	}

}
