package com.jz;

import java.text.DecimalFormat;
import java.util.LinkedList;
import com.jz.leetcode.Util;

public class SeparateChainingHashTable {
	private int count;
	private LinkedList[] theLists;
	private static final int DEFAULT_SIZE = 101;
	private static final float LOAD_FACTOR = 0.75f;

	public SeparateChainingHashTable() throws Exception {
		this(DEFAULT_SIZE);
	}
	
	public SeparateChainingHashTable(int size) throws Exception
	{
		if(size < 0 )
			throw new Exception("Invalid parameter");
		theLists = new LinkedList[size];
		for (int i = 0; i < theLists.length; i++) {
			theLists[i] = new LinkedList();
		}
		
	}
	
	public void makeEmpty()
	{
		for (int i = 0; i < theLists.length; i++) {
			theLists[i] = null;
		}
		
		count = 0;
	}
	
}
