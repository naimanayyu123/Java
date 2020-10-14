package com.employee;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for( int i =0 ; i < 5 ; i++) {
			System.out.println("Enter num");
			arr[i] = sc.nextInt();
		}
		for( int i =0 ; i < 5 ; i++) {
		
			if ((arr[i]& 1 )== 1) {
			System.out.println(arr[i]);
		}
	}

}

}