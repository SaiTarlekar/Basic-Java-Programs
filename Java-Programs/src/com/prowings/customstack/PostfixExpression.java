package com.prowings.customstack;

import java.util.Scanner;

public class PostfixExpression {

	public PostfixExpression() {
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Expression : ");
		String expression = scan.nextLine();
		expression = expression.replaceAll(" ", "");

		System.out.println("Result = " + evaluateExpression(expression));

	}

	public static Object evaluateExpression(String expression) {

		Stack s = new Stack(expression.length());

		for (int i = 0; i < expression.length(); i++) {
			char currentChar = expression.charAt(i);

			if (currentChar >= '0' && currentChar <= '9') {
				int num = Character.getNumericValue(currentChar);
				s.push(num);
			}

			else {
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
		}
		return s.arr[0];
	}

}
