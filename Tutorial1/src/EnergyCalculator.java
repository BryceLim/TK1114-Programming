import java.util.Scanner;

public class EnergyCalculator 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double W, t, T, E;
		System.out.print("Please enter weight of water = ");
		W = sc.nextDouble();
		System.out.print("Please enter initial temperature = ");
		t = sc.nextDouble();
		System.out.print("Please enter final temperature = ");
		T = sc.nextDouble();
		E = W * (T - t) * 4148;
		System.out.print("The total energy is " + E + " Joules");
	}
}
