import java.util.Scanner;

public class CountOccurence {
	
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] storage = new int[10];
        int num;
        for(int i = 0; i < N; i++){
            num = input.nextInt();
            storage[num-1]++;
        }
        for(int i = 1; i <= 10; i++){
            System.out.println(i + ": " + storage[i-1]);
        }
    }
}
