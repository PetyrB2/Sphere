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
	        float pi = 3.14F;
	        float fourThirds = 4/3;
	        // r = radius
		    // d = diameter
		    // c = circumference
		    // a = area
	        // v = Volume
	        
	        /* Calculation of diameter, circumference and area */
		    d = 2 * r;
		    c = 2 * (float)3.14 * r;
		    a = pi * (r * r);
		    v = fourThirds * pi * (r * r * r);
			
	        System.out.println("\n");
	        System.out.println("Diameter      = " + d + " units");
	        System.out.println("Circumference = " + c + " units");
	        System.out.println("Area          = " + a + " sq. units");
	        System.out.println("Volume        = " + v + " some sq. units");
	    }
	}
