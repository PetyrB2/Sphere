package Spherical;

import java.text.DecimalFormat;

//import java.util.Scanner;

public class Sphere {
   private static DecimalFormat f = new DecimalFormat("##.00");

    public static double getVolume(double j) {     
        double volume;  
        double fourThirds = 1.33;
        double pi = 3.14;

        //Note: you must reuse the provided partial implementation above without changing it
        //Hint 1: volume of a sphere is: 4/3*pi*radius^3
        //Hint 2: open the integrated terminal and run the command "gradle test" to execute all tests
        // V= 4/3 * radius^3
        // Volume = 4/3 * PI * (r * r * r)
        //your implementation goes here
       
        
        double radius = 10;
        double diameter = 2 * radius;
        double circumference = 2 * pi * (radius * radius);
                
//     	Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the circle::\n" + radius);

        double r = radius;
        double d;
        double c;
        double a;
        double v;
        
        // r = radius
	    // d = diameter
	    // c = circumference
	    // a = area
        // v = volume
        
        /* Calculation of diameter, circumference and area VOLUME */
	    d = 2 * r;
	    c = 2 * (double)3.14 * r;
	    a = (double)3.14 * (r * r);
	    v = 4/3 * (double)3.14 * (r * r * r);
	    
	    
	    
	    
        System.out.print("\n");
        System.out.println("Diameter      = " + d + " units");
        System.out.println("Circumference = " + c + " units");
        System.out.println("Area          = " + a + " sq. units");
        System.out.println("Volume          = " + v + " sq. units");
		return v;
    }
}