import java.util.Scanner;

public class Triangle {
	
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int i;
        int j;
        for(i = 1; i <= height; i++){
            for(j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
