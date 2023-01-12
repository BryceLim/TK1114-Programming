import java.util.Scanner;
public class TrianglePattern {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int i = 1;
        int j = 1;
        int pattern = size;
        while(j <= size){
            i = 1;
            while(i <= j){
                if(i == j)
                    System.out.print(pattern);
                else
                    System.out.print(pattern + " ");
                i++;
            }
            System.out.println();
            j++;
            pattern--;
        }
    }
}
