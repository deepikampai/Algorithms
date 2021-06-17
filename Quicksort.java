package com.algorithms;

import java.util.Arrays;

public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,4,1,5,7,6};
		System.out.println("input before:" +Arrays.toString(input));
		quickSort(input);
		System.out.println("input after:" +Arrays.toString(input));
	}

	private static void quickSort(int[] input) {
		// TODO Auto-generated method stub
		int low = 0;
		int high = input.length -1;
		
		quicksort(input, low, high);		
	}

	private static void quicksort(int[] input, int left, int right) {
		// TODO Auto-generated method stub
//		if(left >= right) {
//			return ;
//		}		
		int pivot = input[(left + right)/2];
		System.out.println("pivot:" +pivot);
		
		int index = partition(input, left,right,pivot);
		quicksort(input,left, index-1);
		quicksort(input,index, right);
	}

	private static int partition(int[] input, int left, int right, int pivot) {
		// TODO Auto-generated method stub
		while(left <= right) {
			while(input[left] < pivot) {
				left++;
			}
			while(input[right] > pivot) {
				right--;
			}
			if(left < right) {
				swap(input, left, right);
				left++;
				right--;
			}
		}
		return left;
		
	}

	private static void swap(int[] input,int left, int right) {
		// TODO Auto-generated method stub
		int temp = input[left];
		input[left] = input[right];
		input[right] = temp;
			
		
	}

}
