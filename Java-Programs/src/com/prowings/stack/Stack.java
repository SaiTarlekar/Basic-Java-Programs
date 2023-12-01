package com.prowings.stack;

public class Stack {

	
	final int MAX;
	int top;
	int[] a;
	
	
	public Stack(int size) {
		this.MAX = size;
		this.top = -1;
		this.a = new int[size];
	}
	
	boolean isEmpty() {
		return top==-1;
	}
	
	boolean isFull() {
		return top == (MAX-1);
	}

	
	int peek() {
		try {
			if (!isEmpty())
				return a[top];
			else
				throw new IndexOutOfBoundsException("Stack Underflow");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : Element not Available.");
			return Integer.MAX_VALUE;
		}
	}
	
	int size() {
		return top+1;
	}
	
	void push(int x) {
		try {
			if (!isFull())
				a[++top] = x;
			else
				throw new IndexOutOfBoundsException("Stack Overflow");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : Element cannot be Pushed.");
		}
	}
	
	int pop() {
		try {
			if (!isEmpty())
				return a[top--];
			else
				throw new IndexOutOfBoundsException("Stack Underflow");
		} catch (Exception e) {
			System.out.println(e.getMessage() + " : Element cannot be Popped.");
			return Integer.MAX_VALUE;
		}
	}
	
}
