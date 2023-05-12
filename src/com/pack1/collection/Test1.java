package com.pack1.collection;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.SortedSet;
import java.util.TreeSet;

public class Test1 
{
	public static void main(String[] args) 
	{
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		
		boolean b1 = ad.offer(101);
		System.out.println(b1); // true
		
		ad.offer(1);
		ad.offer(5);
		ad.offer(15);
		ad.offer(10);
		ad.offer(-1);
		
		System.out.println(ad); // [101, 1, 5, 15, 10, -1]
		
		int i = ad.peekFirst();
		System.out.println(i); //101
		
		int i1 = ad.peekLast();
		System.out.println(i1); // -1
		
		ad.offerFirst(100);
		ad.offerLast(1001);
		System.out.println(ad); // [100, 101, 1, 5, 15, 10, -1, 1001]
		
		System.out.println("Fetch the value using iterator******");
		
		Iterator<Integer> itr = ad.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
