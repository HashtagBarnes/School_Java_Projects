/*
Dylan G Barnes
Lesson Six Homework: GPS Functions
CSC1060X04 Computer Science 1 
Monday, March 10th, 2024.
*/

/* Notes for Mr. Seely: I noticed in the example that the degrees where only from 0 - 180, 
further research showed that this would only cover the Northern and Eastern Hemispheres.
The Western and Eastern Hemispheres intersect at the Prime Meridian where the Northern and
Southern Hemispheres intersect at the Equator. I adjusted the code based on the example 
to account for this.
*/

import java.util.Scanner;

public class lessonsix {
    static final Scanner KEYBOARD = new Scanner(System.in);
    static final String SEPARATOR = "---------------------------------------------------------------------------";

    public static void main(String[] args) {
        boolean isrunning = true;
        while (isrunning) {
            disp_menu();
            int menu_choice = grab_input();

            switch (menu_choice) {
                case 1:
                    double degrees_to_dec = option_one_conversion();
                    System.out.println(SEPARATOR);
                    System.out.println("- Decimal Degrees: " + degrees_to_dec);
                    System.out.println(SEPARATOR);
                    break;
                case 2:
                    String dec_to_coordinates = option_two_conversion();
                    System.out.println(SEPARATOR);
                    System.out.println("- Degrees, Minutes, Seconds, & Cardinal Direction: " + dec_to_coordinates);
                    System.out.println(SEPARATOR);
                    break;
                default:
                    System.out.println("- Invalid selection. Please select 1 or 2.");
            }

            System.out.print("- Would you like to try another (Y/y or N/n to QUIT)? ");
            String continue_running = KEYBOARD.next();
            while (!continue_running.equalsIgnoreCase("Y") && !continue_running.equalsIgnoreCase("N")) {
			    System.out.println("- Invalid input. Please enter Y to continue or N to quit.");
			    System.out.print("- Would you like to try another (Y/y or N/n to QUIT)? ");
			    continue_running = KEYBOARD.next();
			}

			if (continue_running.equalsIgnoreCase("N")) {
			    isrunning = false;
			    System.out.println("- You have opted to end the use of the GPS conversion tool. Have a nice day!");
			}
			System.out.println(SEPARATOR);
        }
    }

    private static void disp_menu() {
        System.out.println("This program converts between two GPS coordinate systems.");
        System.out.println(SEPARATOR);
        System.out.println("Please select either 1 or 2 from the menu below to choose which conversion you wish to perform.");
        System.out.println(SEPARATOR);
        System.out.println("1. Degrees, minutes, seconds with a cardinal direction (N, S, E, W) to decimal degrees");
        System.out.println("2. Decimal degrees to degrees, minutes, seconds with a cardinal direction (N, S, E, W)");
        System.out.println(SEPARATOR);
        System.out.print("- Your menu selection is: ");
    }

    private static int grab_input() {
        int selection = KEYBOARD.nextInt();
        while (selection < 1 || selection > 2) {
            System.out.println("- Invalid selection. Please select 1 or 2.");
            selection = KEYBOARD.nextInt();
        }
        return selection;
    }

    private static double option_one_conversion() {
        System.out.print("- Enter the degrees (0 to 180): ");
        int degrees = KEYBOARD.nextInt();
        while (degrees < 0 || degrees > 180) {
        	System.out.println("** ERROR: Invalid selection of degrees. Please select between 0 and 180 **");
        	System.out.print("- Enter the degrees (0 to 180): ");
        	degrees = KEYBOARD.nextInt();
        }
        System.out.print("- Enter the minutes (0 to 59): ");
        int minutes = KEYBOARD.nextInt();
        while (minutes < 0 || minutes >= 60) {
        	System.out.println("** ERROR: Invalid selection of minutes. Please select between 0 and 59 **");
        	System.out.print("- Enter the minutes (0 to 59): ");
        	minutes = KEYBOARD.nextInt();
        }
        System.out.print("- Enter the seconds (0 to 59): ");
        double seconds = KEYBOARD.nextDouble();
        while (seconds < 0 || seconds >= 60) {
        	System.out.println("** ERROR: Invalid selection of seconds. Please select between 0 and 59 **");
        	System.out.print("- Enter the seconds (0 to 59): ");
        	seconds = KEYBOARD.nextInt();
        }
        System.out.print("- Enter the cardinal direction (N, S, E, W): ");
        String card_direction = KEYBOARD.next();
        while (!card_direction.equals("N") && !card_direction.equals("S") && !card_direction.equals("E") && !card_direction.equals("W")) {
	        System.out.println("** ERROR: Invalid cardinal direction. Please enter N, S, E, or W. **");
	        System.out.print("- Enter the cardinal direction (N, S, E, W): ");
	        card_direction = KEYBOARD.next().toUpperCase();
    	}

        return option_one_conversion(degrees, minutes, seconds, card_direction);
    }

    private static double option_one_conversion(int degrees, int minutes, double seconds, String card_direction) {
        double degrees_to_dec = degrees + minutes / 60.0 + seconds / 3600.0;
        if (card_direction.equalsIgnoreCase("S") || card_direction.equalsIgnoreCase("W")) {
            degrees_to_dec *= -1;
        }
        return degrees_to_dec;
    }

    private static String option_two_conversion() {
        System.out.print("- Enter the decimal degrees (-180 to 180): ");
        double dec_degrees = KEYBOARD.nextDouble();
        while (dec_degrees < -180 || dec_degrees > 181) {
        	System.out.println("** ERROR: Invalid Decimal Degrees. Please enter decimal degrees between -180 and 180");
        	System.out.print("- Enter the decimal degrees (-180 to 180): ");
        	dec_degrees = KEYBOARD.nextDouble();
        }
        return option_two_conversion(dec_degrees);
    }

    private static String option_two_conversion(double dec_degrees) {
        String card_direction = "N or E";
        if (dec_degrees < 0) {
            card_direction = "S or W";
            dec_degrees *= -1;
        }

        int degrees = (int) dec_degrees;
        double min_conv = (dec_degrees - degrees) * 60;
        int minutes = (int) min_conv;
        double seconds = (min_conv - minutes) * 60;

        return String.format("%d° %d' %.2f\" %s", degrees, minutes, seconds, card_direction);
    }
}
