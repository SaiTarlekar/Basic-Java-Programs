package com.prowings.competitivecoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ElevatorProblem {

	public static final int MIN_FLOOR = 0;
	public static final int MAX_FLOOR = 1000;
	public static final int BUTTON_PRESS = 50;
	static Scanner scan = new Scanner(System.in);
	
	// no-arg constructor.
	public ElevatorProblem() {}
	
	// Method to read current floor as input.
	public static int getCurrentFloor() { 
		int currentFloor = 0;
		System.out.println("Enter Current Floor (0 to 1000) : ");
		
		try {
			int checkFloor = scan.nextInt();
			// Verifying if the entered floor number is between the limit of building.
			if(checkFloor>=MIN_FLOOR && checkFloor<=MAX_FLOOR)
				currentFloor = checkFloor;
			else
				throw new IllegalArgumentException("Input must be between 0 and 1000(Inclusive)");
		}
		catch(Exception e) {
			System.err.println("Invalid Input : " +e.getMessage());
			scannerClose();
			System.exit(1);
		}
		return currentFloor;
	}
	
	// Method to read direction as input.
	public static int getDirection() {
		int currentDirection=0;	
		System.out.println("Enter Direction of Elevator (1 for upward and -1 for downward) :");
		
		try {
			int checkDirection = scan.nextInt();
			scan.nextLine();
			if (checkDirection == -1 || checkDirection == 1)
				currentDirection = checkDirection;
			else
				throw new IllegalArgumentException("Input must be either -1 or 1.");
		}		
		catch(Exception e) {
			System.err.println("Invalid Input : " +e.getMessage());
			scannerClose();
			System.exit(1);
		}
		
		return currentDirection;
	}
	
	// Method to read various input buttons pressed by users to reach their destination.
	public static List<Integer> getButtonsPressed() {
		int count=0, buttonPressed=0;
		List<Integer> buttonPressedList = new ArrayList<>();
		System.out.println("You can now enter the lift : ");
		System.out.println("Enter Button (Press c to close the lift): ");
		while(scan.hasNextInt()) {
			int checkButton = scan.nextInt();
			try {
				if (checkButton>=MIN_FLOOR && checkButton<=MAX_FLOOR) {
					count++;
					buttonPressed = checkButton;
					
					try {
						if(count>BUTTON_PRESS)
							throw new ArrayIndexOutOfBoundsException("Lift Limit Exceeded.");
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
						scannerClose();
						System.exit(1);
					}
				
					buttonPressedList.add(buttonPressed);		
				}
				
				else
					throw new IllegalArgumentException("Press buttons between 0 to 1000.");
			}
			catch(Exception e) {
				System.err.println("Invalid Input : "+e.getMessage());
				scannerClose();
				System.exit(1);
			}		
		}
			
		List<Integer> distinctButtonsPressed = new ArrayList<>();
		for(Integer num:buttonPressedList) {
			if(!distinctButtonsPressed.contains(num))
				distinctButtonsPressed.add(num);
		}

		return distinctButtonsPressed;
	}

	//Method to find the halts taken by lift.
	public static List<Integer> ElevatorHalt(int currentDirection, int currentFloor, List<Integer> buttonsPressed){
		// upward list
		List<Integer> upwardHalts = new ArrayList<>();
		List<Integer> downwardHalts = new ArrayList<>();
		Comparator<Integer> descendingComparator = Collections.reverseOrder();
		
		for(int i=0; i<buttonsPressed.size(); i++) {
			Integer currentElement = buttonsPressed.get(i);
			
			if(currentElement > currentFloor)
				upwardHalts.add(currentElement);
			else
				downwardHalts.add(currentElement);
		}
		Collections.sort(upwardHalts);
		Collections.sort(downwardHalts, descendingComparator);

		if(currentDirection == 1) {
			upwardHalts.addAll(downwardHalts);
			return upwardHalts;
		}
		else {	
			downwardHalts.addAll(upwardHalts);
			return downwardHalts;
		}
		
	}
	
	
	public static void main(String[] args) {
		int currentFloor = getCurrentFloor();
		int currentDirection = getDirection();
		List<Integer> buttonPressedList = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		buttonPressedList = getButtonsPressed();
		result = ElevatorHalt(currentDirection, currentFloor, buttonPressedList);
		
		System.out.println("Result : ");
		for(Integer floor:result)
			System.out.print(" "+floor+" ");
	}

	// Method to close Scanner
	static void scannerClose() {
		scan.close();
	}
}
