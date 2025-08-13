package array;

import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String [] args) {
		int [] array = new int [10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements :");
		for (int i=0;i<10;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("The array elements are :");
		for (int i=0;i<10;i++) {
			System.out.print(array[i]+"\t");

		}
		
		///for (int i=0;i<array.length;i++) {
			///System.out.print(array[i]+"\t");
		///}
		
		//for (int num:array) {
			//System.out.print(num+"\t");
		}
	}

//}
