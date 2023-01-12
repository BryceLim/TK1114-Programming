import java.util.Scanner;
public class SquarePattern {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int i = 1;
        int j = 1;
        int pattern = 1;
        while(j <= x){
            i = 1;
            while(i <= y){
                if(pattern == 1){
                    if(i == y)
                        System.out.print("1");
                    else
                        System.out.print("1 ");
                }
                else{
                    if(i == y)
                        System.out.print("0");
                    else
                        System.out.print("0 ");
                }
                i++;
            }
            System.out.println();
            pattern *= -1;
            j++;
        }
    }
}
