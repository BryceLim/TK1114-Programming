import java.util.Scanner;

public class ReverseArray{

    public static void display(int[] numArr, int N){
        int n = N-1;
        for(int i = n; i >= 0; i--){
            System.out.print(numArr[i] + " ");
        }
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] numArr = new int[N];
        for(int i = 0; i < N; i++)
            numArr[i] = input.nextInt();
        display(numArr, N);
    }
}