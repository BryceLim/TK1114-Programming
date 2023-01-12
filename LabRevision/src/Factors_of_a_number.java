import java.util.Scanner;
public class Factors_of_a_number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 1;
        while(i <= num){
            if(num % i == 0){
                System.out.print(i + " ");
            }
            i++;
        }
        
    }
}
