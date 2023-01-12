import java.util.Scanner;

public class MaximumNumber{

    public static int maxNumber(int a, int b, int c){
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        return(max);
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.print(maxNumber(a,b,c));
    }
}