package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Starting money: ");
		double startAmount = in.nextDouble();
		System.out.print("Win chance: ");
		double winChance = in.nextDouble();
		
		System.out.print("Win limit: ");
		double winLimit = in.nextDouble();
		
		System.out.print("Total Simulations: ");
		int totalSimulations = in.nextInt(); 
		
		in.close();
		
		double chance;
		int round; 
		
		for(int i=1; i <= totalSimulations; i++) {
			System.out.println(i);
			round = 0; 
			while(startAmount < winLimit && startAmount != 0) {
				chance = (int)(Math.random()*100);
				if(chance>= winChance*100) {
				startAmount--; 
				} else {
				startAmount++;
				}
				round++;
				System.out.println(round); 
			} 
			if(startAmount == 0) {
				System.out.println("Simulation " + i + ": " + round + " LOSE");
				} else {
					System.out.println("Simulation " + i + ": " + round + " WIN");
				}
			}
		}
}
