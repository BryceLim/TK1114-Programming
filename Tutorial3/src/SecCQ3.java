/*
 * Write code segments to reads an unspecified number of integers that ends with -1, and find 
 * the number that is divisible by 2 AND 3 . For example, if the input is 2 3 4 5 6 7 8 9 
 * 10 12 15 7 -1 then the output will be 6 and 12.
 */

import java.util.Scanner;
public class SecCQ3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = "";
		int num;
		do {
			num = input.nextInt();
			if((num % 2 == 0) && (num % 3 == 0)) {
				str += num + " ";
			}
		}
		while (num != -1);
		System.out.print(str);
	}
}
