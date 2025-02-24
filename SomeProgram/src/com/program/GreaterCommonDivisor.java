package com.program;
//find the greatest reminder

import java.util.Scanner;

public class GreaterCommonDivisor {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int reminder = 1;
			// Input for the number
			System.out.println("please give Number1: ");
			int dino = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Please Second Number2: ");
			int nino = scanner.nextInt();

			// swiping number if dino is smaller
			if (dino < nino) {
				int temp = dino;
				dino = nino;
				nino = temp;
			}

			if (dino != nino) {
				System.out.println("The Greatest common factor of your " + dino + " and " + nino + " is:");
				while (reminder != 0) {
					reminder = dino % nino;
					if (reminder != 0) {
						dino = nino;
						nino = reminder;
					}
				}
				System.out.println("GCF: " + nino);
			} else {
				System.out.println("Invalid Number!");
			}
			if (scanner != null) {
				scanner.close();
			}
			;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
