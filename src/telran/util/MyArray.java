package telran.util;

import java.util.HashMap;

/**
 * All methods of the class should have complexity O[1]
 * @author User
 *
 * @param <T>
 */
public class MyArray<T> {
	private T allValues;
	private int size;
	private HashMap<Integer, T> mapOfSets;
	public MyArray(int size) {
		this.size = size;
		mapOfSets = new HashMap<>();
	}
	/**
	 * sets all array's elements with a given value
	 * @param value
	 */
	public void setAll(T value) {
		
		//TODO
	}
	/**
	 * 
	 * @param index
	 * @return value at given index or null if index is wrong
	 */
	public T get(int index) {
		//TODO
		return null;
	}
	/**
	 * sets a given value at a given index
	 * throws IndexOutOfBoundsException in the case of wrong index
	 * @param index
	 * @param value
	 */
	public void set(int index, T value) {
		//TODO
	}
}
