import java.util.Scanner;

public class Menu_Driven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int shape = input.nextInt();
        double value1 = input.nextDouble();
        double value2 = 0;
        double sum;
        if(shape != 1) {
        	value2 = input.nextDouble();
        }
        switch(shape){
            case 1 : sum = 3.14 * value1 * value1; break;
            case 2 : sum = value1 * value2; break;
            case 3 : sum = 0.5 * value1 * value2; break;
            default : sum = 0; break;
        }
        System.out.printf("%.2f", sum);
    }
}