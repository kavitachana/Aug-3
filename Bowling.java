package com.kavita.bowling;

public class Bowling {

	public static void main(String[] args) {
		
	int pins = 10;
	int frames = 10;
//	int throwsPerFrame = 2;
	int rollOne;
	int rollTwo;
	int totalScore;
	
//	int[] firstRoll = new firstRoll[10];
//	int[] secondRoll = [10];
//	int[][] totalScore = [firstRoll][secondRoll];
	
			
	for(int i = 1; i < frames; i++) {
	
		rollOne = (int) ((Math.random() * pins) + 1);
		
		totalScore = rollOne;
		System.out.println("Roll One: " + totalScore);
		
		
		if(rollOne > 10) {
	
		
	for(int j = 1; j < frames; j++) {
			rollTwo = (int) ((Math.random() * pins) + 1);
			totalScore =+ rollTwo;
			System.out.println("Roll Two: " + totalScore);
	}
		}
		
	
//	if(pinsDown == 10) {
//		break;
	}
	
	
//	System.out.println("You knocked down " + pinsDown + " pins");
	}
	
	
		
	}
