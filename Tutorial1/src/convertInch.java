import java.text.DecimalFormat;
import java.util.Scanner;
public class convertInch
{
	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner sc = new Scanner(System.in);
		int inches;
		double meters;
		System.out.print("Please enter inches : ");
		inches = sc.nextInt();
		meters = inches * 0.0254;
		System.out.print("Inches to Meters : ");
		System.out.print(df.format(meters));
	}
}
