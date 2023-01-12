import java.util.Scanner;

public class Triangle_Wave{

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        int f = input.nextInt();
        int A = input.nextInt();
        int i;
        int j;
        int k;
        for(k = 1; k <= f; k++){
            for(i = 1; i < A; i++) {
			    for(j = 1; j <= i; j++) {
				    System.out.print(i);
			    }
			    System.out.println();
		    }
		    for(i = A; i >= 1; i--) {
			    for(j = 1; j <= i; j++) {
				    System.out.print(i);
			    }
			    System.out.println();
            }
		}
    }
}