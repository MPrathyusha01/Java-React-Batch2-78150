//2.Write a Java program to test if an array contains a 65 value using above array.
package java_handson;


public class Quest_2 {

	public static void main(String[] args) {
		int lis[] = {23,12,45,67,90,23,54,67,8,1,14};
		int check = 65;
		boolean flag = false;
		
		for(int num:lis) {
			if(num==check) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("The array contains the value 65");
		} else {
			System.out.println("The array does not have value 65");
		}
		

	}

}
