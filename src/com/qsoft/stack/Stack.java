package com.qsoft.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	List<Integer> listNumber = new ArrayList<Integer>();

	public Stack(int size) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < size; i++) {
			listNumber.add(0);
		}
	}

	public Stack() {
		// TODO Auto-generated constructor stub
	}

	public int getSize() {
		// TODO Auto-generated method stub
		return listNumber.size();
	}

	public void push(int i) {
		// TODO Auto-generated method stub
		listNumber.add(i);
	}

	public Integer top() {
		// TODO Auto-generated method stub
		if (listNumber.size() == 0) {
			return null;
		}
		int index = listNumber.size() - 1;
		return listNumber.get(index);
	}

	public int pop() {
		if (listNumber.size() == 0) {
			throw new RuntimeException("StackEmptyException");
		}
		// TODO Auto-generated method stub
		int index = listNumber.size() - 1;
		int number = listNumber.get(index);
		listNumber.remove(index);
		return number;
	}
}
