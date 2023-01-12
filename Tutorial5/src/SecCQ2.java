import java.util.Scanner;

public class SecCQ2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int[] storage = new int[10];
        int num;
        for(int i = 0; i < 10; i++){
            num = input.nextInt();
            storage[num-1]++;
        }
        for(int i = 1; i <= 10; i++){
            System.out.println(i + ": " + storage[i-1]);
        }
	}
}
