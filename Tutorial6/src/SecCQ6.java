import java.util.Scanner;
public class SecCQ6 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String str2 = new String();
		int[] count = new int[128];
		int i;
		int max = 0;
		char most_occurence = ' ';
		for(i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
			if(count[str.charAt(i)] >= max) {
				max = count[str.charAt(i)];
				most_occurence = str.charAt(i);
			}
		}
		System.out.print(most_occurence);
	}
}
