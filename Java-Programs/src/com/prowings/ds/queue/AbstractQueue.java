package com.prowings.ds.queue;

public abstract class AbstractQueue<E> implements Queue<E>{
	
	
	public void clear() {
		while(poll() != null);
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
}
