import java.util.Scanner;
public class NaturalNumberAndSum {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int sum = 0;
        int num = 0;
        for(int i = 0; i < N; i++){
            num += 2;
            sum += num;
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print(sum);
    }
}
