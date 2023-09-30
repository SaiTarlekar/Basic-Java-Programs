package com.prowings.competitivecoding;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ElevatorProblem {

	static Scanner scan = new Scanner(System.in);
	
	public ElevatorProblem() {}
	
	public static int getCurrentFloor() { 
		int currentFloor = 0;
		System.out.println("Enter Current Floor (0 to 1000) : ");
		
		try {
			int num = scan.nextInt();
			if(num>=0 && num<=1000)
				currentFloor = num;
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
	
	public static int getDirection() {
		int currentDirection=0;	
		System.out.println("Enter Direction of Elevator (1 for upward and -1 for downward) :");
		
		try {
			int num = scan.nextInt();
			scan.nextLine();
			if (num == -1 || num == 1)
				currentDirection = num;
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
	
	public static List<Integer> getButtonsPressed() {
		int count=0, buttonPressed=0;
		List<Integer> buttonPressedList = new ArrayList<>();
		System.out.println("You can now enter the lift : ");
		System.out.println("Enter Button (Press c to close the lift): ");
		while(scan.hasNextInt()) {
			int num = scan.nextInt();
			try {
				if (num>=0 && num<=1000) {
					count++;
					buttonPressed = num;
					
					try {
						if(count>50)
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
		for(Integer num:result)
			System.out.print(" "+num+" ");
	}

	static void scannerClose() {
		scan.close();
	}
}
