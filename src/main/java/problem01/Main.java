package problem01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		//
		// 코드를 완성 하십시오.
		//
		
		int temp;
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int p = i+1 ; p < arr.length ; p++) {
				if(arr[i] < arr[p]) {
					temp = arr[i];
					arr[i] = arr[p];
					arr[p] = temp;
				}
			}
		}
		
		for(int q = arr.length-2 ; q < arr.length ; q++) {
			if(q == arr.length-2) {
				System.out.print("[");
			}
			
			System.out.print(arr[q]);
			
			if(q != arr.length-1) {
				System.out.print(",");
			}
			
			if(q == arr.length-1) {
				System.out.print("]");
			}
			
		}
		
	}
}
