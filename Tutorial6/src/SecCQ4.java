import java.util.Scanner;
public class SecCQ4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String str2 = new String();
		char temp;
		for(int i = 0; i < str.length(); i++) {
			temp = str.charAt(i);
			if(temp=='a' || temp=='e' || temp=='i' || temp=='o' || temp=='u' ||
			   temp=='A' || temp=='E' || temp=='I' || temp=='O' || temp=='U')
				str2 += '*';
			else
				str2 += temp;
		}
		System.out.print(str2);
	}
}
