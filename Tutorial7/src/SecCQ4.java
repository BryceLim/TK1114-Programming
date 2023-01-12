import java.util.Scanner;
public class SecCQ4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double guest = input.nextDouble();
		double rice_price = input.nextDouble();
		double rice_weight = total_rice_weight(guest);
		double labour_hours = total_labour_hours(guest);
		double rice_cost = total_cost_of_rice(rice_price, rice_weight);
		double labour_cost = total_cost_of_labour(labour_hours);
		double total_cost = total_cost_of_cooking(rice_cost, labour_cost);
		System.out.printf("%.1f\n", rice_weight);
		System.out.printf("%.1f\n", labour_hours);
		System.out.printf("%.1f\n", rice_cost);
		System.out.printf("%.1f\n", labour_cost);
		System.out.printf("Total cost: RM %.2f\n", total_cost);
	}
	
	// (900kg / 1000guest) = 0.9kg per guest
	// total_rice_weight = number of guest * 0.9kg per guest
	public static double total_rice_weight(double guest) {
		return (guest * 0.9);
	}
	
	// (5hrs / 900kg) * 0.9kg per guest = 0.005hrs per guest
	// total_labour_hours = number of guest * 0.005hrs per guest
	public static double total_labour_hours(double guest) {
		return (guest * 0.005);
	}
	
	// total cost of rice = (price of rice per kg * weight of rice)
	public static double total_cost_of_rice(double rice_price, double rice_weight) {
		return (rice_price * rice_weight);
	}
	
	// total cost of labour = total labour hours * RM25 per hour
	public static double total_cost_of_labour(double labour_hours) {
		return (labour_hours * 25);
	}
	
	// total cost of cooking the rice = total cost of rice + total cost of labour
	public static double total_cost_of_cooking(double rice_cost, double labour_cost) {
		return (rice_cost + labour_cost);
	}

}
