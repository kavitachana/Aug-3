package com.kavita.bowling;

public class Bowling {

	public static void main(String[] args) {

		int pins = 10;
		int frames = 10;

		int[] rollOne = new int[11];
		int[] rollTwo = new int[11];
		int[] frameScore = new int[11];

		int totalScore = 0;

		for (int i = 1; i <= frames; i++) {

			rollOne[i] = (int) ((Math.random() * pins));

			if (rollOne[i] == 10) {

				frameScore[i] = rollOne[i];
			}

			else {
				
				rollTwo[i] = (int) ((Math.random() * pins));

				while (rollTwo[i] + rollOne[i] > 10) {

					rollTwo[i] = (int) ((Math.random() * pins));
				}

			}
		
		frameScore[i] = rollOne[i] + rollTwo[i];
		totalScore += frameScore[i];
		
		System.out.println("Frame " + i + " Score: " +frameScore[i] );
		}
		
		System.out.println("\nGame Score: " + totalScore);
	}
}
