import java.util.Scanner;
public class SecCQ5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String str2 = new String();
		for(int i = str.length() - 1; i >= 0; i--)
			str2 += str.charAt(i);
		System.out.print(str2);
	}
}
