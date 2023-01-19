import java.util.*;
import java.io.*;

public class Legoland_Ticketing_System {
	public static Scanner input = new Scanner(System.in);
	public static PrintWriter pw;

	public static void main(String[] args) throws IOException {
		int[][] package_price = new int[9][2];
		int type_of_pass = 0;
		int type_of_package = 0;
		int[] num_of_guest = new int[4];
		int total_price = 0;
		int sub_total = 0;
		char buy_more = 'y';
		
		WELCOME(); //display welcome message and ask user to input name(prints name to receipt file)
		package_price = PACKAGE_PRICE(NATIONALITY()); //save package price
		while(buy_more == 'y'){
			sub_total = 0;
			type_of_package = 0;
			while(type_of_package == 0){
				type_of_pass = TYPE_OF_PASS(); //save type of pass chosen
				type_of_package = TYPE_OF_PACKAGE(type_of_pass, package_price); //save the type of package chosen
				//if back is chosen, the while loops remains true
			}
			num_of_guest = NUMBER_OF_GUEST(package_price, type_of_package); //save the number of guest
			sub_total = SUB_TOTAL(num_of_guest, type_of_package, package_price); //save the subtotal of the price of ticket
			GENERATE_SUBTOTAL(package_price, type_of_pass, type_of_package, num_of_guest, sub_total);//print the details of the tickets chosen in receipt file
			total_price += sub_total; //add the subtotal to the the total price of the ticket
			buy_more = YES_OR_NO(buy_more); //determine whether the customer wants to buy more tickets
			System.out.println();
		}
		System.out.printf("Total price = RM%.2f\n", (double)total_price); //print the total price onto the console
		System.out.println("Receipt succesfully generated");
		GENERATE_TOTAL(total_price); //print the total price into the receipt file
	}

	//Print the welcome statements
	public static String WELCOME() throws IOException{
		System.out.println();
		System.out.println("*****               ****************  ******************  *******************  *****               ******************  ******          *********  **************     ");
		System.out.println("*   *               *              *  *                *  *                 *  *   *               *                *  *    *         *        *  *             *     ");
		System.out.println("*   *               *    ***********  *   **************  *   ***********   *  *   *               *   **********   *  *    *        *    *    *  *   *******    *    ");
		System.out.println("*   *               *    *            *   *               *   *         *   *  *   *               *   *        *   *  *    *       *    **    *  *   *      *    *   ");
		System.out.println("*   *               *    *            *   *               *   *         *   *  *   *               *   *        *   *  *    *      *    * *    *  *   *       *    *  ");
		System.out.println("*   *               *    *            *   *               *   *         *   *  *   *               *   **********   *  *    *     *    *  *    *  *   *        *   *  ");
		System.out.println("*   *               *    ***********  *   *               *   *         *   *  *   *               *   *        *   *  *    *    *    *   *    *  *   *        *   *  ");
		System.out.println("*   *               *              *  *   *     ********  *   *         *   *  *   *               *   **********   *  *    *   *    *    *    *  *   *        *   *  ");
		System.out.println("*   *               *    ***********  *   *     *      *  *   *         *   *  *   *               *   *        *   *  *    *  *    *     *    *  *   *        *   *  ");
		System.out.println("*   *               *    *            *   *     ****   *  *   *         *   *  *   *               *   *        *   *  *    * *    *      *    *  *   *       *    *  ");
		System.out.println("*   *               *    *            *   *        *   *  *   *         *   *  *   *               *   *        *   *  *    **    *       *    *  *   *      *    *   ");
		System.out.println("*   **************  *    ***********  *   **********   *  *   ***********   *  *   **************  *   *        *   *  *    *    *        *    *  *   *******    *    ");
		System.out.println("*                *  *              *  *                *  *                 *  *                *  *   *        *   *  *        *         *    *  *             *     ");
		System.out.println("******************  ****************  ******************  *******************  ******************  *****        *****  *********          ******  **************      ");
		System.out.println("Welcome to Legoland Malaysia!!!");
		System.out.println("Operating hours : Monday to Sunday (10a.m. - 6p.m.)");
		System.out.println("                  *Closed every Wednesday*");
		System.out.println("Location        : 7, Persiaran Medini Utara 3, 79100 Iskandar Puteri, Johor");
		System.out.println();
		System.out.print("Please enter your name : ");
		String name = input.nextLine();
		System.out.println();
		pw = new PrintWriter("Receipt for " + name + ".txt");
		pw.println("Name : " + name);
		pw.println();
		return name;
	}
	
	//Allows users to select their nationality
	public static int NATIONALITY(){
		int nationality = 0;
		String malaysian = "malaysian";
		String singaporean = "singaporean";
		String others = "others";
		String one = "1";
		String two = "2";
		String three = "3";
		while(!(nationality == 1 || nationality == 2 || nationality ==3)){
			System.out.println("Please choose your nationality:");
			System.out.println("1. Malaysian");
			System.out.println("2. Singaporean");
			System.out.println("3. Others");
			System.out.println();
			System.out.print("My nationality is ");
			String user_input = input.next();
			if(user_input.equalsIgnoreCase(malaysian) || user_input.equals(one))
				nationality = 1;
			else if(user_input.equalsIgnoreCase(singaporean) || user_input.equals(two))
				nationality = 2;
			else if(user_input.equalsIgnoreCase(others) || user_input.equals(three))
				nationality = 3;
			else 
				nationality = 0;
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
			System.out.print("Type of pass : ");
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
				System.out.print("Package Number : ");
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
				System.out.print("Package Number : ");
				type_of_package = input.nextInt();
				System.out.println();
			}
			if(type_of_package != 0)
				type_of_package += 5;
			break;
		}
		return type_of_package;
	}

	//Show the prices of the package according to age group
	public static void SHOW_PACKAGE_PRICES(int package_num, int[][] package_price){
		System.out.println("   Children        : RM" + package_price[package_num][0] +".00\n   Adult           : RM" + package_price[package_num][1] + ".00\n   Senior          : RM" + package_price[package_num][0] + ".00\n   Children under 3: Free Admission");
	}

	//To determine the name of the package chosen
	public static String NAME_OF_PACKAGE(int type_of_package){
		String name_of_package;
		switch(type_of_package){
			case 1: name_of_package = "Theme Park";break;
			case 2: name_of_package = "Water Park";break;
			case 3: name_of_package = "SEA LIFE";break;
			case 4: name_of_package = "Theme Park + SEA LIFE";break;
			case 5: name_of_package = "Theme Park + Water Park + SEA LIFE";break;
			case 6: name_of_package = "Single Park Pass";break;
			case 7: name_of_package = "Double Park Pass";break;
			case 8: name_of_package = "Triple Park Pass";break;
			default : name_of_package = "";break;

		}
		return name_of_package;
	}

	//Display the price of package and allow the user to enter the number of guest visiting
	public static int[] NUMBER_OF_GUEST(int[][] package_price,int type_of_package){
		int[] num_of_guest = new int[4];
		System.out.println();
		System.out.println("Please insert number of guest");
		System.out.print("Adult              (RM"+package_price[type_of_package][1] +".00) : ");
		num_of_guest[0] = input.nextInt();
		System.out.print("Children           (RM"+package_price[type_of_package][0] +".00) : ");
		num_of_guest[1] = input.nextInt();
		System.out.print("Senior             (RM"+package_price[type_of_package][0] +".00) : ");
		num_of_guest[2] = input.nextInt();
		System.out.print("Children under 3       (Free) : ");
		num_of_guest[3] = input.nextInt();
		System.out.println();
		return num_of_guest;
	}

	//Calculate and display the total price of all tickets
	public static int SUB_TOTAL(int[] num_of_guest, int type_of_package, int[][] package_price){
		int sub_total = 0;
		sub_total += ((num_of_guest[1] + num_of_guest[2]) * package_price[type_of_package][0]) + (num_of_guest[0] * package_price[type_of_package][1]);
		return sub_total;
	}
	
	//To determine whether the customer wishes to purchase more tickets
	public static char YES_OR_NO(char buy_more){
		String yes_or_no;
		String yes = "yes";
		String no = "no";
		String y = "y";
		String n = "n";
		buy_more = 'a';
		while(!(buy_more == 'y' || buy_more == 'n')){
		System.out.println("Do you wish to buy more tickets? yes/no");
		yes_or_no = input.next();
		if(yes_or_no.equalsIgnoreCase(yes) || yes_or_no.equalsIgnoreCase(y))
			buy_more = 'y';
		else if(yes_or_no.equalsIgnoreCase(no) || yes_or_no.equalsIgnoreCase(n))
			buy_more = 'n';
		else 
			buy_more = 'a';
		}
		return(buy_more);
	}

	//To print the details of the subtotal into the receipt
	public static void GENERATE_SUBTOTAL(int[][] package_price, int type_of_pass, int type_of_package, int[] num_of_guest, int sub_total){
		pw.println("Package : " + NAME_OF_PACKAGE(type_of_package));
		pw.println("Adult             (RM" + package_price[type_of_package][1] + ".00)   x" + num_of_guest[0] + "    RM" + (package_price[type_of_package][1]*num_of_guest[0]) + ".00");
		pw.println("Children          (RM" + package_price[type_of_package][0] + ".00)   x" + num_of_guest[1] + "    RM" + (package_price[type_of_package][0]*num_of_guest[1]) + ".00");
		pw.println("Senior            (RM" + package_price[type_of_package][0] + ".00)   x" + num_of_guest[2] + "    RM" + (package_price[type_of_package][0]*num_of_guest[2]) + ".00");
		pw.println("Children under 3  (RM" + package_price[type_of_package][1] + ".00)   x" + num_of_guest[0] + "    RM0.00");
		pw.println("                                  --------------");
		pw.println("                                     RM" + sub_total + ".00");
		pw.println();
		
	}

	//To print the total price into the receipt
	public static void GENERATE_TOTAL(int total_price){
		pw.println("------------------------------------------------");
		pw.println("Total price                          RM"+ total_price + ".00");
		pw.println("------------------------------------------------");
		pw.println();
		pw.println("Please present this receipt upon collection of tickets");
		pw.close();
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
