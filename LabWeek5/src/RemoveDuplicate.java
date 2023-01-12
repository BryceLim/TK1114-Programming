import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        int N = input.nextInt();
	        int[] number = new int[N];
	        for(int i = 0; i < N; i++){
	            number[i] = input.nextInt();
	        }
	        for(int i = 0; i < N; i++){
	            for(int j = i + 1; j < N; j++){
	                if(number[i] == number[j])
	                    number[j] = 0;
	            }
	        }
	        for(int i = 0; i < N; i++){
	            if(number[i] != 0)
	                System.out.print(number[i] + " ");
	        }
	}

}
