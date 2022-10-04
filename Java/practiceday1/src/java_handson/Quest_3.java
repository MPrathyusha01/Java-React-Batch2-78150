//3. Write a Java program to find the index of an array element
package java_handson;
import java.util.ArrayList;
import java.util.Scanner;

public class Quest_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lis[] = {23,12,45,67,90,23,54,67,8,1,14};
		System.out.println("Enter the number you need to find the index: ");
		int find = sc.nextInt();
		ArrayList<Integer> alist = new ArrayList<>();
		for (int num: lis) {
			alist.add(num);
		}
		
		if (alist.contains(find)) {
			System.out.println("The index is "+alist.indexOf(find));
		} else {
			System.out.println("The "+find+" not found!");
		}
		

	}

}
