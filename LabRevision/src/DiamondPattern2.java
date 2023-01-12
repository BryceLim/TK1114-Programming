import java.util.Scanner;
public class DiamondPattern2 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int i = 1;
        int j = 1;
        int pattern = size;
        while(i <= size){
            j = 1;
            while(j <= pattern){
                if(j == pattern)
                    System.out.print(j);
                else
                    System.out.print(j + " ");
                j++;
            }
            System.out.println();
            pattern--;
            i++;
        }
        i = 1;
        pattern = 1;
        while(i <= size){
            j = 1;
            while(j <= pattern){
                if(j == pattern)
                    System.out.print(j);
                else
                    System.out.print(j + " ");
                j++;
            }
            System.out.println();
            pattern++;
            i++;
        }
    }
}
