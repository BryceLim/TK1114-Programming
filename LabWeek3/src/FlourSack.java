import java.util.Scanner;
public class FlourSack{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 0;
        int j = 0;
        int weight;
        int total = 0;
        int heaviest = 0;
        while(i < 10) {
            weight = input.nextInt();
            if(i == 0)
            	heaviest = weight;
            if(weight < 100 && weight > 0) {
                total += weight;
                j++;
                if(weight > heaviest)
                	heaviest = weight;
            }
            i++;
        }
        System.out.println("Total kg of flour : " + total);
        System.out.printf("Average kg of flour : %.2f\n", (double)total/j);
        System.out.println("Flour sack for Al-Ameen : " + heaviest + "kg");
    }
}