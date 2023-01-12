import java.util.Scanner;

public class Rectangle_Star{

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int i;
        int j;
        for(i = 1; i <= N; i++){
            for(j = 1; j <= M; j++){
                if(i == 1 || i == N)
                    System.out.print("*");
                else{
                    if(j == 1 || j == M)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}