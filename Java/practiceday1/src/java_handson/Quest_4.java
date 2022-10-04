//4. Write a Java program to insert an element (8th position) into an array
package java_handson;

import java.util.ArrayList;
import java.util.Scanner;

public class Quest_4 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int lis[] = {23,12,45,67,90,23,54,67,8,1,14};
//		System.out.println("Enter the position: ");
//		int position = sc.nextInt();
//		System.out.println("Enter the element: ");
//		int element = sc.nextInt();
//		
//		for(int i = (lis.length)- 1; i> position; i--) {
//			lis[i] = lis[i-1];
//		}
//		lis[position] = element;
//		for (int num: lis) {
//			System.out.println(num);
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the position: ");
		int position = sc.nextInt();
		System.out.println("Enter the element: ");
		int element = sc.nextInt();
		ArrayList<Integer> alist = new ArrayList<>();
		int lis[] = {23,12,45,67,90,23,54,67,8,1,14};
		for (int num:lis) {
			alist.add(num);
		}
		alist.add(position, element);
		for(int num:alist) {
			System.out.print(num + " ");
		}
	}

}
