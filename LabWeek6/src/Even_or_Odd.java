import java.util.Scanner;

public class Even_or_Odd{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        is_evenOdd(num);
    }
    
    public static void is_evenOdd(int num){
        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}