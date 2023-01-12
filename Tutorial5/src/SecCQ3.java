import java.util.Scanner;

public class SecCQ3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];
		for(int i = 0; i < 10; i++) {
			num[i] = input.nextInt();
		}
		for(int i = 9; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
	}
}
