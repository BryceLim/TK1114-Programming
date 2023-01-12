import java.util.Scanner;

public class AboveBelowAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        double[] storage = new double[N];
        double sum = 0;
        double average;
        int above = 0;
        for(int i = 0; i < N; i++){
            storage[i] = input.nextDouble();
            sum += storage[i];
        }
        average = sum/N;
        for(int i = 0; i < N; i++){
            if(storage[i] > average)
                above++;
        }
        System.out.printf("%.2f %d %d", average, above, (N-above));
	}

}
