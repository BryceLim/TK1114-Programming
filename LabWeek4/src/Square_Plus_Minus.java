import java.util.Scanner;

public class Square_Plus_Minus{

    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int i;
        int j;
        int k;
        for(i = 1; i <= N; i++){
            k = 1;
            for(j = 1; j <= N; j++){
                if(k == 1){
                    System.out.print("+");
                    k = 0;
                }
                else{
                    System.out.print("-");
                    k = 1;
                }
            }
            System.out.println();
        }
    }
}
