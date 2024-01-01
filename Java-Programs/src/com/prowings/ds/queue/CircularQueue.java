package com.prowings.ds.queue;

import java.util.Arrays;

public class CircularQueue<E> extends AbstractQueue<E>{

	private static final int DEFAULT_INITIAL_CAPACITY = 10;
	private final int MAX;
	private int front;
	private int rear;
	private Object[] circularQueue;
	private int modCount;

	
	public CircularQueue() {
		this(DEFAULT_INITIAL_CAPACITY);
	}
	
	
	public CircularQueue(int size) {
		if(size < 1)
			throw new IllegalArgumentException();
		this.front = this.rear = -1;
		this.modCount = 0;
		this.circularQueue = new Object[size];
		this.MAX = size;
	}
	

	@Override
	public int size() {
		return modCount;
	}

	
	@Override
	public boolean isFull() {
		return (size() == MAX);
	}

	
	@Override
	public boolean enqueue(E e) {
		if (e == null)
			throw new NullPointerException();
		
		if(isFull())
			throw new IllegalStateException();
		
		else {
			if(modCount == 0)
				front++;
			modCount++;
		}
		
		
		return false;
	}

	
	@Override
	public E dequeue() {
		return null;
	}

	
	@Override
	public E peek() {
		return null;
	}
	

	@Override
	public E element() {
		return null;
	}

	@Override
	public E poll() {
		return null;
	}

	@Override
	public E rear() {
		return cast(circularQueue[rear]);
	}

	public int capacity() {
		return MAX;
	}
	
	public void ensureCapacity(int capacity) {
		if(MAX < capacity) 
			circularQueue = Arrays.copyOf(circularQueue, capacity);
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	public String toString() {
		return "";
	}
	
	@SuppressWarnings("unchecked")
	private static <T> T cast(Object o) {
		return (T) o;
	}
	
}
