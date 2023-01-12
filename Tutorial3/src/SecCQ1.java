/*
 * Write code segments that reads 10 integers and count the numbers that are larger than 10
 * and smaller than 10. For example, if the input is 13 19 9 32 70 5 42 2 33 62 
 * then the output will be 7 and 3.
 */

import java.util.Scanner;
public class SecCQ1 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		int i = 0;
		int j = 0;
		int num = 0;
		while (i + j < 10) {
			num = input.nextInt();
			if(num > 10) 
				i++;
			else
				j++;
		}
		System.out.print(i + " " + j);
	}
}
