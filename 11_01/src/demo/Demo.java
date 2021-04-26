package demo;

import java.util.Scanner;
import planet.Planet;


public class Demo {

	public static void main(String[] args) {
		int foldTomeg = read();
		
		double mass = foldTomeg / Planet.EARTH.getSurfaceGravity();
		
		for (Planet p : Planet.values()) {
			System.out.printf("A t�meged a %s: %f \n", p, p.surfaceWeight(mass));
		}

		
	}

	public static int read() {
		Scanner sc = new Scanner(System.in);
		int number = 0;

		do {
			System.out.println("K�rem a t�meget: ");
			while (!sc.hasNextInt()) {
				System.out.println("Ez nem egy t�meg!");
				sc.nextLine();
			}
			number = sc.nextInt();

		} while (number < 1 || number > 200);

		return number;
	}

}
