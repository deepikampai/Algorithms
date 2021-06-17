package com.algorithms;

import java.util.ArrayList;

public class NodesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] origNumbers = {3,6,2,9,-1,10,5,11,3};
		String largerBranch =  test(origNumbers);
		System.out.println("larger branch:" +largerBranch);
	}
	
	public static String test(long[] num) {
		if(num.length == 0)
			return "";
		
		ArrayList<Long> newArray = new ArrayList<>();
		
		for(int i = 0; i< num.length; i++) {
			if(num[i] == -1) {
				continue;
			}
			newArray.add(num[i]);			
		}
		System.out.println("ArrayList values:" +newArray);
		
		ArrayList<Long> leftArray = new ArrayList<>();
		ArrayList<Long> rightArray = new ArrayList<>();
		for(int j=0 ; j<newArray.size(); j++) {
			if(j == 0) {
				leftArray.add(newArray.get(j));
				rightArray.add(newArray.get(j));
				continue;
			}
			if(j%2 == 0) {
				rightArray.add(newArray.get(j));
			}
			else
				leftArray.add(newArray.get(j));
		}
		
		System.out.println("Left ArrayList values:" +leftArray);
		System.out.println("Right ArrayList values:" +rightArray);
		
		long  leftArraySum = 0;
		long  rightArraySum = 0;
		
		for(int i = 0; i< leftArray.size();i++) {
			leftArraySum = leftArraySum + leftArray.get(i);
		}
		System.out.println("leftArraySum:" +leftArraySum);
		
		for(int i = 0; i< rightArray.size();i++) {
			rightArraySum = rightArraySum + rightArray.get(i);
		}
		System.out.println("leftArraySum:" +rightArraySum);
		
		if(leftArraySum == rightArraySum)
			return "";
		else if(leftArraySum > rightArraySum)
		  return "left";
		else
			return "right";
		}

}
