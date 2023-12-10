package com.prowings.customstack;

class Stack {

	final int MAX;
	int top;
	Object[] arr;

	public Stack(int size) {
		this.MAX = size;
		this.top = -1;
		arr = new Object[size];
	}

	boolean isEmpty() {
		return top == -1;
	}

	boolean isFull() {
		return top == (MAX - 1);
	}

	int size() {
		return top;
	}

	Object peek() {
		try {
			if (!isEmpty()) {
				return arr[top];
			} else
				throw new IndexOutOfBoundsException("Stack Underflow");
		} catch (Exception e) {
			System.err.println(e.getMessage() + " : Stack is Empty");
			return null;
		}
	}

	void push(Object obj) {
		try {
			if (!isFull())
				arr[++top] = obj;
			else
				throw new IndexOutOfBoundsException("Stack Overflow");
		} catch (Exception e) {
			System.err.println(e.getMessage() + " : Cannot push new element.");
		}
	}

	Object pop() {
		try {
			if (!isEmpty()) {
				return arr[top--];
			} else
				throw new IndexOutOfBoundsException("Stack Underflow");
		} catch (Exception e) {
			System.err.println(e.getMessage() + " : Stack is Empty.");
			return null;
		}
	}

}
