package uk.ac.belfastmet;

import java.util.ArrayList;

public class ReturnArrayList {

	public static void main(String[] args) {
		ReturnArrayList returnArrayList = new ReturnArrayList();
		returnArrayList.addStringToArrayList();
		
		
	}
	
	public void addStringToArrayList() {
	
	ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		System.out.println("Size of Array: " + list.size());
		
		for(int index = 0; index < list.size(); index++) {
			String indexValue = list.get(index);
			System.out.println("Value of String: " + indexValue);
		}
		
		
			
	}

}
