import java.util.*;
public class Legoland_Ticketing_System {
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[][] package_price = new int[9][2];
		int total_price = 0;
		//int nationality = 0;
		int type_of_pass = 0;
		int type_of_package = 0;
		int[] num_of_guest = new int[4];
		char buy_more = 'y';
		
		WELCOME();
		//nationality = NATIONALITY();
		package_price = PACKAGE_PRICE(NATIONALITY()); //save package price

		while(buy_more == 'y'){
			while(type_of_package == 0){
				type_of_pass = TYPE_OF_PASS(); //save type of pass chosen
				type_of_package = TYPE_OF_PACKAGE(type_of_pass, package_price); //save the type of package chosen
				//if back is chosen, the while loops remains true
			}
			num_of_guest = NUMBER_OF_GUEST(package_price,type_of_package); //save the number of guest
			total_price += TOTAL_PRICE(num_of_guest, type_of_package, package_price); //save the total price of the ticket
			System.out.println("Do you wish to buy more tickets? y/n");
			buy_more = input.next().charAt(0);
			System.out.println();
		}
		System.out.printf("Total price = RM%.2f\n", (double)total_price);
	}

	//Print the welcome statements
	public static void WELCOME(){
		System.out.println("Welcome to Legoland Malaysia\n");
	}
	
	//Allows users to select their nationality
	public static int NATIONALITY(){
		int nationality = 0;
		while(!(nationality == 1 || nationality == 2 || nationality ==3)){
			System.out.println("Please choose your nationality:");
			System.out.println("1. Malaysian");
			System.out.println("2. Singaporean");
			System.out.println("3. Others");
			System.out.println();
			nationality = input.nextInt();
			System.out.println();
		}
		return nationality;
	}
	
	//Allow users to select the type of pass
	public static int TYPE_OF_PASS(){
		int type_of_pass = 0;
		while(!(type_of_pass ==1 || type_of_pass == 2)){
			System.out.println("Please choose type of pass:");
			System.out.println("1. Day Ticket");
			System.out.println("2. Annual Pass");
			System.out.println();
			type_of_pass = input.nextInt();
			System.out.println();
		}
		return type_of_pass;
	}

	//Allow users to select the type of package they want
	public static int TYPE_OF_PACKAGE(int type_of_pass, int[][] package_price){
		System.out.println("Please choose type of package:");
		int type_of_package = -1;
		switch(type_of_pass){
			case 1 : while(!(type_of_package == 0 || type_of_package == 1 || type_of_package == 2 || type_of_package == 3 || type_of_package == 4 || type_of_package == 5)){
				System.out.println("1. Theme Park only");
				SHOW_PACKAGE_PRICES(1, package_price);
				System.out.println("\n2. Water Park only");
				SHOW_PACKAGE_PRICES(2, package_price);
				System.out.println("\n3. SEA LIFE only");
				SHOW_PACKAGE_PRICES(3, package_price);
				System.out.println("\n4. Theme Park + SEA LIFE");
				SHOW_PACKAGE_PRICES(4, package_price);
				System.out.println("\n5. Theme Park + SEA LIFE + Water Park");
				SHOW_PACKAGE_PRICES(5, package_price);
				System.out.println();
				System.out.println("0. Back");
				System.out.println();
				type_of_package = input.nextInt();
				System.out.println();
			}
			break;
			case 2 : while(!(type_of_package == 0 || type_of_package == 1 || type_of_package == 2 || type_of_package == 3)){
				System.out.println("1. Single-Park Pass");
				SHOW_PACKAGE_PRICES(6, package_price);
				System.out.println("\n2. Double-Park Pass");
				SHOW_PACKAGE_PRICES(7, package_price);
				System.out.println("\n3. Triple-Park Pass");
				SHOW_PACKAGE_PRICES(8, package_price);
				System.out.println();
				System.out.println("0. Back");
				System.out.println();
				type_of_package = input.nextInt();
				System.out.println();
			}
			if(type_of_package != 0)
				type_of_package += 5;
			break;
		}
		return type_of_package;
	}

	public static void SHOW_PACKAGE_PRICES(int package_num, int[][] package_price){
		System.out.println("   Children: RM" + package_price[package_num][0] +".00 Adult: RM" + package_price[package_num][1] + ".00 Senior: RM" + package_price[package_num][0] + ".00 Children under 3: Free Admission");
	}

	//Display the price of package and allow the user to enter the number of guest visiting
	public static int[] NUMBER_OF_GUEST(int[][] package_price,int type_of_package){
		int[] num_of_guest = new int[4];
		System.out.println("Adult            : RM"+package_price[type_of_package][1] +".00");
		System.out.println("Children         : RM"+package_price[type_of_package][0] +".00");
		System.out.println("Senior           : RM"+package_price[type_of_package][0] +".00");
		System.out.println("Children under 3 : Free admission");
		System.out.println();
		System.out.println("Please insert number of guest");
		System.out.print("Adult : ");
		num_of_guest[0] = input.nextInt();
		System.out.print("Children : ");
		num_of_guest[1] = input.nextInt();
		System.out.print("Senior : ");
		num_of_guest[2] = input.nextInt();
		System.out.print("Children under 3 : ");
		num_of_guest[3] = input.nextInt();
		System.out.println();
		return num_of_guest;
	}

	//Calculate and display the total price of all tickets
	public static int TOTAL_PRICE(int[] num_of_guest, int type_of_package, int[][] package_price){
		int total_price = 0;
		total_price += ((num_of_guest[1] + num_of_guest[2]) * package_price[type_of_package][0]) + (num_of_guest[0] * package_price[type_of_package][1]);
		return total_price;
	}
	
	//Save price according to the nationality
	public static int[][] PACKAGE_PRICE(int nationality){
		int[][] package_price = new int[9][2];
		if(nationality == 1) {
			package_price[1][0] = 149; 
			package_price[1][1] = 189;
			package_price[2][0] = 114; 
			package_price[2][1] = 139;
			package_price[3][0] = 69;
			package_price[3][1] = 89;
			package_price[4][0] = 200;
			package_price[4][1] = 210;
			package_price[5][0] = 259;
			package_price[5][1] = 313;
			package_price[6][0] = 169;
			package_price[6][1] = 199;
			package_price[7][0] = 219;
			package_price[7][1] = 279;
			package_price[8][0] = 279;
			package_price[8][1] = 339;
		}
		else if(nationality == 2){
			package_price[1][0] = 157;
			package_price[1][1] = 199;
			package_price[2][0] = 120;
			package_price[2][1] = 146;
			package_price[3][0] = 69;
			package_price[3][1] = 89;
			package_price[4][0] = 210;
			package_price[4][1] = 262;
			package_price[5][0] = 272;
			package_price[5][1] = 329;
			package_price[6][0] = 199;
			package_price[6][1] = 249;
			package_price[7][0] = 259;
			package_price[7][1] = 319;
			package_price[8][0] = 329;
			package_price[8][1] = 399;
		}
		else {
			package_price[1][0] = 157;
			package_price[1][1] = 199;
			package_price[2][0] = 120;
			package_price[2][1] = 146;
			package_price[3][0] = 69;
			package_price[3][1] = 89;
			package_price[4][0] = 210;
			package_price[4][1] = 262;
			package_price[5][0] = 272;
			package_price[5][1] = 329;
			package_price[6][0] = 299;
			package_price[6][1] = 349;
			package_price[7][0] = 359;
			package_price[7][1] = 419;
			package_price[8][0] = 429;
			package_price[8][1] = 499;
		}
		return package_price;
	}

}