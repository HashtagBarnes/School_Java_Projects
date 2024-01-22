import java.util.Scanner;

public class lessontwo
{

	// Scanner Object Init.
	static final Scanner KEYBOARD = new Scanner(System.in);

	// Planetary Constants (in Miles)
	static final double _Sun_Diameter = 8.75e5;
	static final double _Mercury_Diameter = 3e3;
	static final double _Venus_Diameter = 7.5e3;
	static final double _Earth_Diameter = 8e3;
	static final double _Mars_Diameter = 4.222e3;
	static final double _Jupiter_Diameter = 8.6881e4;
	static final double _Saturn_Diameter = 7.5e4;
	static final double _Uranus_Diameter = 3.176e4;
	static final double _Neptune_Diameter = 3.0775e4;
	static final double _Pluto_Diameter = 1.4e3; // is a planet ;)

	static final double _Mercury_Distance = 3.6e7;
	static final double _Venus_Distance = 6.72e7;
	static final double _Earth_Distance = 9.3e7;
	static final double _Mars_Distance = 1.416e8;
	static final double _Jupiter_Distance = 4.836e8;
	static final double _Saturn_Distance = 8.867e8;
	static final double _Uranus_Distance = 1.784e9;
	static final double _Neptune_Distance = 2.7944e9;
	static final double _Pluto_Distance = 3.6745e9;

	// Other Variables
	static double _Size_Of_Sun;

	// Conversion Constants
	static final int miles_to_feet = 5280;
	static final int feet_to_inches = 12;
	static final int yard_to_feet = 3;
	static final double _Sun_Size_Scaler = _Sun_Diameter * miles_to_feet * feet_to_inches;

	
	public static void main(String[] args)
	{
	    System.out.println("This program calculates the sizes and distances for a scale model of the solar system based on your input of the size of the sun, in inches.");
	    System.out.print("Enter the size of the sun (in inches): ");
	    _Size_Of_Sun = KEYBOARD.nextDouble();
	    System.out.println("SCALE MODEL DIMENSIONS - Sun: " + _Size_Of_Sun + " inches");
	    double diameter_scaler = _Size_Of_Sun / _Sun_Diameter; 
	    double distance_scaler = _Size_Of_Sun / _Sun_Size_Scaler;

	    // Mercury Calculations
		double mercuryScaledDiameter = _Mercury_Diameter * diameter_scaler;
		double mercuryScaledDistanceInches = _Mercury_Distance * distance_scaler * miles_to_feet * feet_to_inches;
		double mercuryScaledDistanceFeet = mercuryScaledDistanceInches / feet_to_inches;
		double mercuryScaledDistanceYards = mercuryScaledDistanceFeet / yard_to_feet;
		double mercuryScaledDistanceMiles = mercuryScaledDistanceInches / (miles_to_feet * feet_to_inches);

		// Venus Calculations
		double venusScaledDiameter = _Venus_Diameter * diameter_scaler;
		double venusScaledDistanceInches = _Venus_Distance * distance_scaler * miles_to_feet * feet_to_inches;
		double venusScaledDistanceFeet = venusScaledDistanceInches / feet_to_inches;
		double venusScaledDistanceYards = venusScaledDistanceFeet / yard_to_feet;
		double venusScaledDistanceMiles = venusScaledDistanceInches / (miles_to_feet * feet_to_inches);

		// Earth Calculations
		double earthScaledDiameter = _Earth_Diameter * diameter_scaler;
		double earthScaledDistanceInches = _Earth_Distance * distance_scaler * miles_to_feet * feet_to_inches;
		double earthScaledDistanceFeet = earthScaledDistanceInches / feet_to_inches;
		double earthScaledDistanceYards = earthScaledDistanceFeet / yard_to_feet;
		double earthScaledDistanceMiles = earthScaledDistanceInches / (miles_to_feet * feet_to_inches);

		// Mars Calculations
		double marsScaledDiameter = _Mars_Diameter * diameter_scaler;
		double marsScaledDistanceInches = _Mars_Distance * distance_scaler * miles_to_feet * feet_to_inches;
		double marsScaledDistanceFeet = marsScaledDistanceInches / feet_to_inches;
		double marsScaledDistanceYards = marsScaledDistanceFeet / yard_to_feet;
		double marsScaledDistanceMiles = marsScaledDistanceInches / (miles_to_feet * feet_to_inches);

		// Jupiter Calculations
		double jupiterScaledDiameter = _Jupiter_Diameter * diameter_scaler;
		double jupiterScaledDistanceInches = _Jupiter_Distance * distance_scaler * miles_to_feet * feet_to_inches;
		double jupiterScaledDistanceFeet = jupiterScaledDistanceInches / feet_to_inches;
		double jupiterScaledDistanceYards = jupiterScaledDistanceFeet / yard_to_feet;
		double jupiterScaledDistanceMiles = jupiterScaledDistanceInches / (miles_to_feet * feet_to_inches);

		// Saturn Calculations
		double saturnScaledDiameter = _Saturn_Diameter * diameter_scaler;
		double saturnScaledDistanceInches = _Saturn_Distance * distance_scaler * miles_to_feet * feet_to_inches;
		double saturnScaledDistanceFeet = saturnScaledDistanceInches / feet_to_inches;
		double saturnScaledDistanceYards = saturnScaledDistanceFeet / yard_to_feet;
		double saturnScaledDistanceMiles = saturnScaledDistanceInches / (miles_to_feet * feet_to_inches);

		// Uranus Calculations
		double uranusScaledDiameter = _Uranus_Diameter * diameter_scaler;
		double uranusScaledDistanceInches = _Uranus_Distance * distance_scaler * miles_to_feet * feet_to_inches;
		double uranusScaledDistanceFeet = uranusScaledDistanceInches / feet_to_inches;
		double uranusScaledDistanceYards = uranusScaledDistanceFeet / yard_to_feet;
		double uranusScaledDistanceMiles = uranusScaledDistanceInches / (miles_to_feet * feet_to_inches);

		// Neptune Calculations
		double neptuneScaledDiameter = _Neptune_Diameter * diameter_scaler;
		double neptuneScaledDistanceInches = _Neptune_Distance * distance_scaler * miles_to_feet * feet_to_inches;
		double neptuneScaledDistanceFeet = neptuneScaledDistanceInches / feet_to_inches;
		double neptuneScaledDistanceYards = neptuneScaledDistanceFeet / yard_to_feet;
		double neptuneScaledDistanceMiles = neptuneScaledDistanceInches / (miles_to_feet * feet_to_inches);

		// Pluto Calculations
		double plutoScaledDiameter = _Pluto_Diameter * diameter_scaler;
		double plutoScaledDistanceInches = _Pluto_Distance * distance_scaler * miles_to_feet * feet_to_inches;
		double plutoScaledDistanceFeet = plutoScaledDistanceInches / feet_to_inches;
		double plutoScaledDistanceYards = plutoScaledDistanceFeet / yard_to_feet;
		double plutoScaledDistanceMiles = plutoScaledDistanceInches / (miles_to_feet * feet_to_inches);

		// Print statements
        System.out.println("\n--- Mercury Calculations ---\nMercury's Diameter: " + mercuryScaledDiameter + "\nMercury's Distance in Inches: " + mercuryScaledDistanceInches + "\nMercury's Distance in Feet: " + mercuryScaledDistanceFeet + "\nMercury's Distance in Yards: " + mercuryScaledDistanceYards + "\nMercury's Distance in Miles: " + mercuryScaledDistanceMiles);
        System.out.println("\n--- Venus Calculations ---\nVenus's Diameter: " + venusScaledDiameter + "\nVenus's Distance in Inches: " + venusScaledDistanceInches + "\nVenus's Distance in Feet: " + venusScaledDistanceFeet + "\nVenus's Distance in Yards: " + venusScaledDistanceYards + "\nVenus's Distance in Miles: " + venusScaledDistanceMiles);
        System.out.println("\n--- Earth Calculations ---\nEarth's Diameter: " + earthScaledDiameter + "\nEarth's Distance in Inches: " + earthScaledDistanceInches + "\nEarth's Distance in Feet: " + earthScaledDistanceFeet + "\nEarth's Distance in Yards: " + earthScaledDistanceYards + "\nEarth's Distance in Miles: " + earthScaledDistanceMiles);
        System.out.println("\n--- Mars Calculations ---\nMars's Diameter: " + marsScaledDiameter + "\nMars's Distance in Inches: " + marsScaledDistanceInches + "\nMars's Distance in Feet: " + marsScaledDistanceFeet + "\nMars's Distance in Yards: " + marsScaledDistanceYards + "\nMars's Distance in Miles: " + marsScaledDistanceMiles);
        System.out.println("\n--- Jupiter Calculations ---\nJupiter's Diameter: " + jupiterScaledDiameter + "\nJupiter's Distance in Inches: " + jupiterScaledDistanceInches + "\nJupiter's Distance in Feet: " + jupiterScaledDistanceFeet + "\nJupiter's Distance in Yards: " + jupiterScaledDistanceYards + "\nJupiter's Distance in Miles: " + jupiterScaledDistanceMiles);
		System.out.println("\n--- Saturn Calculations ---\nSaturn's Diameter: " + saturnScaledDiameter + "\nSaturn's Distance in Inches: " + saturnScaledDistanceInches + "\nSaturn's Distance in Feet: " + saturnScaledDistanceFeet + "\nSaturn's Distance in Yards: " + saturnScaledDistanceYards + "\nSaturn's Distance in Miles: " + saturnScaledDistanceMiles);
		System.out.println("\n--- Uranus Calculations ---\nUranus's Diameter: " + uranusScaledDiameter + "\nUranus's Distance in Inches: " + uranusScaledDistanceInches + "\nUranus's Distance in Feet: " + uranusScaledDistanceFeet + "\nUranus's Distance in Yards: " + uranusScaledDistanceYards + "\nUranus's Distance in Miles: " + uranusScaledDistanceMiles);
		System.out.println("\n--- Neptune Calculations ---\nNeptune's Diameter: " + neptuneScaledDiameter + "\nNeptune's Distance in Inches: " + neptuneScaledDistanceInches + "\nNeptune's Distance in Feet: " + neptuneScaledDistanceFeet + "\nNeptune's Distance in Yards: " + neptuneScaledDistanceYards + "\nNeptune's Distance in Miles: " + neptuneScaledDistanceMiles);
		System.out.println("\n--- Pluto Calculations ---\nPluto's Diameter: " + plutoScaledDiameter + "\nPluto's Distance in Inches: " + plutoScaledDistanceInches + "\nPluto's Distance in Feet: " + plutoScaledDistanceFeet + "\nPluto's Distance in Yards: " + plutoScaledDistanceYards + "\nPluto's Distance in Miles: " + plutoScaledDistanceMiles);
	}
}
