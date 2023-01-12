import java.util.Scanner;

public class SecCQ5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean identical = true;
		int[] list1 = new int[10];
		int[] list2 = new int[10];
		for(int i = 0; i < 10; i++)
			list1[i] = input.nextInt();
		for(int i = 0; i < 10; i++)
			list2[i] = input.nextInt();
		for(int i = 0; i < 10;){
			if(list1[i] == list2[i]) {
				identical = true;
				i++;
			}
			else
				identical = false;
				break;
		}
		System.out.println(identical);
	}
}
