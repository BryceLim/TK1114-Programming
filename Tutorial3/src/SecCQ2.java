/*
 * Write code segments that reads 10 integers and output the sum and average of the
 * numbers. For example, if the input is 13 4 5 -2 -9 10 8 9 1 -5 then the output
 * will be 34.00 and 3.40 (the output is in two decimal format).
 */

import java.util.Scanner;
public class SecCQ2 {

	public static void main(String[] args) {
		Scanner input =  new Scanner(System.in);
		int i = 0;
		double sum = 0;
		double num = 0;
		while (i < 10) {
			num = input.nextDouble();
			sum += num;
			i++;
		}
		System.out.printf("%.2f %.2f", sum, sum/10);
	}
}