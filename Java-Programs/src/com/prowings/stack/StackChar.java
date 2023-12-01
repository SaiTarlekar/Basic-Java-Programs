package com.prowings.stack;

public class StackChar {

	final int MAX;
	int top;
	char[] chars;

	StackChar(int size) {
		this.MAX = size;
		this.top = -1;
		this.chars = new char[size];
	}

	boolean isEmpty() {
		return top == -1;
	}

	boolean isFull() {
		return top == (MAX - 1);
	}

	int size() {
		return top + 1;
	}

	char peek() {
		try {
			if (!isEmpty())
				return chars[top];
			else
				throw new IndexOutOfBoundsException("Stack Underflow");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : Element not Available.");
			return 0;
		}
	}

	void push(char ch) {
		try {
			if (!isFull())
				chars[++top] = ch;
			else
				throw new IndexOutOfBoundsException("Stack Overflow");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : Element cannot be Pushed.");
		}
	}

	char pop() {
		try {
			if (!isEmpty())
				return chars[top--];
			else
				throw new IndexOutOfBoundsException("Stack Underflow");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : Element cannot be Popped. Exiting Program.");
			System.exit(MAX);
			return '\u0000';
		}
	}

}

