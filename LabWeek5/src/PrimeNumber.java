import java.util.Scanner;

public class PrimeNumber{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int temp;
        boolean isprime;
        for(int i = 0; i < N; i++){
            isprime = true;
            temp = input.nextInt();
            if(temp == 2)
                System.out.print(temp + " ");
            else if(temp > 2 && temp % 2 != 0){
                for(int j = 2; j < temp/2; j++){
                    if(temp % j == 0){
                        isprime = false;
                       continue;
                    }
                }
                if(isprime == true)
                    System.out.print(temp + " ");
            }
        }
    }
}