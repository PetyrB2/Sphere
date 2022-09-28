package Spherical;

import java.util.Scanner;

public class Sphere2 {

	 public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in);

	        System.out.println("Enter the radius of the circle::\n");

	        float r = in.nextFloat();
	        float d;
	        float c;
	        float a;
	        float v;
	        float s;
	        float pi = 3.14F;
	        float fourThirds = 4/3;
	        // r = radius
		    // d = diameter
		    // c = circumference
		    // a = area
	        // v = Volume
	        // s = Surface Area = 4 * pi * (r * r)
	        /* Calculation of diameter, circumference and area */
		    d = 2 * r;
		    c = 2 * pi * r;
		    a = pi * (r * r);
		    v = fourThirds * pi * (r * r * r);
			s = 4 * pi * (r * r);
			
			// This code is added to handle exceptions such as over 10000 or 0
			if (r > 10000 || r == 0) {
				System.out.println("Radius cannot be over 10,000 and cannot be 0");
			}
			// This exception is added to handle Negative radius values
			else if (r < 0) {
				throw new IllegalArgumentException("Radius must be a positive value.");
			}
			System.out.println("\n");
	        System.out.println("Diameter      = " + d + " units");
	        System.out.println("Circumference = " + c + " units");
	        System.out.println("Area          = " + a + " sq. units");
	        System.out.println("Volume        = " + v + " cubed units");
	        System.out.println("Surface Area  = " + s + " sq. units");
	    }
	}
