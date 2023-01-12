/*
 * Write code segments to reads an unspecified number of integers that ends with 0, and output
 * the maximum value. For example, if the input is 12 34 56 6 77 89 100 14 45 -
 * 23 -89 99 0 then the output will be 100
 */

import java.util.Scanner;

public class SecCQ4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int highest = input.nextInt();
		int num = highest;
		do {
			if(num > highest)
				highest = num;
			num = input.nextInt();
		}
		while(num != 0);
		if(highest != 0)
			System.out.print(highest);
	}
}
