package com.prowings.ds.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		ArrayQueue<Integer> q = new ArrayQueue<Integer>(10);
		
		System.out.println(q.capacity());
		q.ensureCapacity(30);
		System.out.println(q.capacity());
		
		

		
	}

}
