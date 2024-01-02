package com.dmdev.oop.lesson18;

import java.util.Iterator;

public class List<T> implements Iterable<T> {
    private T[] object;
    private int size;

    public List(int initialSize) {
	this.object = (T[]) new Object[initialSize];

    }

    public void add(T element) {

	object[size++] = element;

    }

    public T get(int index) {
	return object[index];
    }

    public int getSize() {
	return size;
    }

    @Override
    public Iterator<T> iterator() {
	// TODO Auto-generated method stub
	return null;
    }
    	private class ListIterator implements Iterator<T>{

	    @Override
	    public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	    }

	    @Override
	    public T next() {
		// TODO Auto-generated method stub
		return null;
	    }
    	    
    	}

}
