import java.util.Scanner;
public class Is_It_The_Same {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String[] str2 = new String[N];
		for(int i = 0; i < N; i++) {
			str2[i] = input.next();
		}	
		String[] temp = new String[N];
		for(int i = 0; i < N; i++) {
			temp[i] = "";
            str2[i]= str2[i].toLowerCase();
			for(int j = str2[i].length() - 1; j >= 0; j--) {
				temp[i] += str2[i].charAt(j);
			}
			if(str2[i].equals(temp[i])) {
				System.out.println("Case #" + (i+1) + ": Yes");
			}
			else
				System.out.println("Case #" + (i+1) + ": No");
		}
	}
}