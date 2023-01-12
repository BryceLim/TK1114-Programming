import java.util.Scanner;

public class SecCQ6_Ver1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] number = new int[10];
		int temp;
		boolean duplicate;
		for(int i = 0; i < 10; i++){
			temp = input.nextInt();
			duplicate = false;
			if(i == 0) {
				number[i] = temp;
				System.out.print(number[i] + " ");
			}
			else {
				for(int j = i - 1; j >= 0; j--) {
					if(temp == number[j]) {
						duplicate = true;
						break;
					}
				}
				if(!duplicate) {
					number[i] = temp;
					 System.out.print(number[i] + " ");
				}
			}
		}
	}
}