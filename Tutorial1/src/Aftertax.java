import java.util.Scanner;
public class Aftertax 
{
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		double price, total;
		System.out.print("Enter price of product : ");
		price = sc.nextDouble();
		total = price * 1.06;
		System.out.print("The toatl price after tax is " + total);
	}
}
