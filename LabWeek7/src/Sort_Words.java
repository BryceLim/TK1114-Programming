import java.util.*;
public class Sort_Words {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] str2 = str.split(" ");
		String[] temp = new String[1];
		
		//Arrays.sort(str2);
		
		for(int i = 0; i < str2.length; i++) {
			for(int j = i + 1; j < str2.length; j++) {
				if(str2[i].compareTo(str2[j]) > 0) {
					temp[0] = str2[i];
					str2[i] = str2[j];
					str2[j] = temp[0];
					
				}
			}
		}
		
		for(int i = 0; i < str2.length; i++) {
			System.out.print(str2[i] + " ");
		}

	}

}