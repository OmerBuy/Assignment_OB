package assignments.assignment_9;

import java.util.Scanner;

public class Question2_Laptop {

	public static void main(String[] args) {


//				First ask user for a screen size. If screen size is equals to 13.3, add  $200 to the laptop price. 
//				If screen size is equals to  15.0 - add  $300 to the laptop price. 
//				If screen size is equals to  17.3 - add  $400 to the laptop price. 
//				Then ask user for CPU type. If CPU type equals to i3, add  $150 to the laptop price.
//				If CPU type equals to i5, add  $250 to the laptop price. 
//				If CPU type equals to i7, add  $350 to the laptop price. 
//				Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price.
//				Then, ask user for storage type. There are 2 options: SSD and HDD.
//				If it's HDD - add $50 to the laptop price for every 500gb. 
//				If it's SSD - add $100 to the laptop price for every 500GB. 
//				Then ask user for for screen resolution. 
//				There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.

				double price = 0;
				String storageType, screenType, cpu, screenResolution;
				int ram = 0, memorySize = 0;
				double screenSize = 0;
				Scanner scan = new Scanner(System.in);

				System.out.println("Select screen size:");
				screenSize = scan.nextDouble();
				scan.nextLine();
				System.out.println("Select CPU type:");
				cpu = scan.nextLine();
				System.out.println("Select RAM size:");
				ram = scan.nextInt();
				scan.nextLine();
				System.out.println("Select storage type:");
				storageType = scan.nextLine();
				System.out.println("Enter memory size:");
				memorySize = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter screen resolution:");
				screenResolution = scan.nextLine();

				if (screenSize == 13.3) {
					price += 200;
				} else if (screenSize == 15.0) {
					price += 300;
				} else if (screenSize == 17.3) {
					price += 400;
				}

				/*
				 * If CPU type equals to i3, add $150 to the laptop price. If CPU type equals to
				 * i5, add $250 to the laptop price. If CPU type equals to i7, add $350 to the
				 * laptop price.
				 */
				if (cpu.equalsIgnoreCase("i3")) {
					price += 150;
				} else if (cpu.equalsIgnoreCase("i5")) {
					price += 250;
				} else if (cpu.equalsIgnoreCase("i7")) {
					price += 350;
				}

				/*
				 * Then ask user for RAM size. Add $50 for every 4GB of ram to the laptop price.
				 */
				int _4gb = 0;
				_4gb = ram / 4;
				for (int i = 0; i < _4gb; i++) {
					price += 50;
				}
				/*
				 * * Then, ask user for storage type. There are 2 options: SSD and HDD. If it's
				 * HDD - add $50 to the laptop price for every 500gb. If it's SSD - add $100 to
				 * the laptop price for every 500GB.
				 */
				int _500gb = 0;
				_500gb = memorySize / 500;
				int add = 0;
				if (storageType.equalsIgnoreCase("ssd")) {
					add = 100;
				}
				if (storageType.equalsIgnoreCase("hdd")) {
					add = 50;
				}
				for (int i = 0; i < _500gb; i++) {
					price += add;

				}

				/*
				 * * Then ask user for for screen resolution. There are 2 options: FULLHD and
				 * 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.
				 */

				if (screenResolution.equalsIgnoreCase("fullhd")) {
					price += 100;
				}
				if (screenResolution.equalsIgnoreCase("4k")) {
					price += 200;
				}
				System.out.println("Laptop price is: $" + price);
			}
	}


