import java.util.Scanner;
public class Reverse_Words {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] str2 = str.split(" ");
		for(int i = str2.length - 1; i >= 0; i--)
		    System.out.print(str2[i] + " ");
	}
}
