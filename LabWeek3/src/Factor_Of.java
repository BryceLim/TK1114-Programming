import java.util.Scanner;
public class Factor_Of {

	public static void main(String[] args){
	    
        Scanner input = new Scanner(System.in);
        int i = 1;
        int num = input.nextInt();
        while(i <= num/2){
            if(num % i == 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.print(num);
    }
}
