package com.prowings.customstack;

import java.util.Arrays;
import java.util.Scanner;

public class PostfixExpression1 {

	public PostfixExpression1() {
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Expression : ");
		String expression = scan.nextLine();

		System.out.println("Result = " + evaluateExpression(expression));
	}

	public static Object evaluateExpression(String expression) {

		
		String[] elements = expression.split(" "); 
		System.out.println(Arrays.toString(elements));
		Stack s = new Stack(elements.length);
		
		for(int i=0; i<elements.length; i++) {
			
			char currentChar = elements[i].charAt(0);
			
			if(!Character.isDigit(currentChar)) {
				int op2 = (Integer) s.pop();
				int op1 = (Integer) s.pop();
				int result = 0;
				switch (currentChar) {
				case '+':
					result += (op1 + op2);
					s.push(result);
					break;

				case '-':
					result += (op1 - op2);
					s.push(result);
					break;

				case '*':
					result += (op1 * op2);
					s.push(result);
					break;

				case '/':
					try {
						if (!(op2 == 0)) {
							result += (op1 / op2);
							s.push(result);
						} else
							throw new ArithmeticException("Zero Division Error.");
					} catch (Exception e) {
						System.err.println(e.getMessage());
					}
					break;

				default:
					System.out.println("Illegal Operator. Exiting the program.");
					System.exit(0);
				}
			}
			
			else 
				s.push(Integer.parseInt(elements[i]));
		}

		return s.arr[0];
	}

}
