import java.util.Scanner;
public class String_Length {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 1;
        int j = 10;
        while(num > j){
            j *= 10;
            i++;
        }
        System.out.println(i);
    }
}
