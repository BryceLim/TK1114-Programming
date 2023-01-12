import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class SecCQ6_Ver3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =10; int []arr=new int[n];
		int []arr1=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		//Arrays.sort(arr);
		 Set<Integer> data = new LinkedHashSet<Integer>();  
		 for(int i:arr) {data.add(i);}
		 for(int i:data) {System.out.print(i + " ");}
	}
}
