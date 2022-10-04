//1.Write a Java program to sort following numeric array
//[23,12,45,67,90,23,54,67,8,1,14]
package java_handson;

import java.util.Arrays;

public class Quest_1 {

	public static void main(String[] args) {
		int lis[] = {23,12,45,67,90,23,54,67,8,1,14};
		System.out.println("Before sorting: ");
		for (int num:lis) {
			System.out.print(num+ " ");
		}
		
		Arrays.sort(lis);
		System.out.println("\n After sorting: ");
		for (int num:lis) {
			System.out.print(num+ " " );
		}
	}

}
