import java.util.Scanner;

public class SecCQ4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double[] storage = new double[10];
        double sum = 0;
        double average;
        int above = 0;
        for(int i = 0; i < 10; i++){
            storage[i] = input.nextDouble();
            sum += storage[i];
        }
        average = sum/10;
        for(int i = 0; i < 10; i++){
            if(storage[i] >= average)
                above++;
        }
        System.out.printf("%.2f %d %d", average, above, (10-above));
	}
}
