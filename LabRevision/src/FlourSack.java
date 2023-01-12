import java.util.Scanner;
public class FlourSack{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int weight;
		int max = 0;
		int sum = 0;
		int i = 0;
		for(int j = 0; j < 10; j++){
			weight = input.nextInt();
			if(j == 0)
				max = weight;
			if(weight > 0 && weight < 100){
				if(weight > max)
					max = weight;
				sum += weight;
				i++;
			}
		}
		System.out.println("Total kg of flour : " + sum);
		System.out.printf("Average kg of flour : %.2f\n", (double)sum/i);
		System.out.println("Flour sack for Al-Ameen : " + max + "kg");
	}
}