import java.util.Scanner;

public class SecCQ6_Ver2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data, n=10;
		int[] arr=new int[n];
		
		for (int i=0; i<n; i++) { 
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count==0) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}