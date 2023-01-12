import java.util.Scanner;

public class Min_Max_Mark {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		int num,max,min,sum;
		int i,j;
		for(j = 0; j < test; j++) {
			num = input.nextInt();
			max = num;
			min = num;
			sum = 0;
			for(i = 0; num != -1; i++) {
				if(num > max)
					max = num;
				else if(num < min)
					min = num;
				sum += num;
				num = input.nextInt();
			}
			System.out.printf("%.2f ", (float)sum);
			System.out.printf("%.2f ", (float)sum/i);
			System.out.print(max + " ");
			System.out.print(min);
			System.out.println();
		}
	}
}
