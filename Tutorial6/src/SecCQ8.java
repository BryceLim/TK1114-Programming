import java.util.Scanner;
public class SecCQ8 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String str2 = new String();
		if(str.charAt(str.length() - 1) % 2 == 0)
			System.out.print("Female");
		else
			System.out.print("Male");
	}
}
