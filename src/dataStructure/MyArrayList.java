package com.jz;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class MyArrayList<E> {
	private int size;
	private Object[] elementData;
	private int modCount;

	private static final Object[] EMPTY_ARRAY_LIST = {};
	private static final int DEFAULT_SIZE = 10;

	public MyArrayList() {
		size = 0;
		elementData = new Object[DEFAULT_SIZE];
	}
	
	public MyArrayList(int size)
	{
		if(size > 0)
			this.elementData = new Object[size];
		else if (size == 0)
			this.elementData = EMPTY_ARRAY_LIST;
		size = 0;
	}

	public int size()
	{
		return size;
	}
	
	public MyArrayList(Collection<E> c) {
		elementData = c.toArray();
		size = elementData.length;
	}

	public void ensureCapacity(int minCapacity) {
		int oldCapacity = elementData.length;
		int newCapacity = oldCapacity >> 1 + oldCapacity;

		if (newCapacity < minCapacity)
			newCapacity = minCapacity;
		if (minCapacity > Integer.MAX_VALUE)
			newCapacity = Integer.MAX_VALUE;

		elementData = Arrays.copyOf(elementData, newCapacity);
	}

	public void add(E e)
	{
		ensureCapacity(size+1);
		elementData[size] = e;
		size++;
	}
	
	public void add(int index, E e) {
		if (index > size() || index < 0)
			throw new IndexOutOfBoundsException();

		ensureCapacity(size + 1);

		System.arraycopy(elementData, index, elementData, index + 1, size - index);

		elementData[index] = e;

		size++;

	}

	public E remove(int index) {
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException();

		E oldValue = (E) elementData[index];

		System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
		size--;
		elementData[size] = null; //let Gc work

		return oldValue;

	}
	
	public MyArrayListIterator iterator()
	{
		return new MyArrayListIterator();
	}
	
	private class MyArrayListIterator implements Iterator<E>
	{
		int cursor = 0;

		@Override
		public boolean hasNext() {
			return (cursor < size);
		}

		@Override
		public E next() {
			return (E) elementData[cursor++];
		}
		
		public void remove()
		{
			
			MyArrayList.this.remove(--cursor);
			
		}
	}

	public static void main(String[] args) {
		Random random = new Random();
		MyArrayList<Integer> ma = new MyArrayList<Integer>(18);
		for (int i = 0; i < 15; i++) {
			ma.add(new Integer(i));
		}
		
		Iterator itr = ma.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
		System.out.println("my arraylist size is " + ma.size());
	}

}
