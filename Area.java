import java.util.*;
public class Area {
	float radius, length, breadth, side, altitude, base;
	double pi = 3.14, area;
	Scanner s = new Scanner(System.in);
	void circle() {
	        System.out.print("Enter radius of circle:");
	        radius = s.nextInt();
	        area =  pi * radius * radius;
	        System.out.println("Area of circle:"+area);
	    } 
	    void rectangle() {
	        System.out.print("Enter length of rectangle:");
	        length = s.nextInt();
	        System.out.print("Enter breadth of rectangle:");
	        breadth = s.nextInt();
	        area = 2 * (length + breadth);
	        System.out.println("Area of rectangle:"+area);
	    }
	    void square() {
	        System.out.print("Enter side of square:");
	        side = s.nextInt();
	        area = side * side;
	        System.out.println("Area of square:"+area);
	    }
	    void triangle() {
	        System.out.print("Enter altitude of triangle:");
	        altitude = s.nextInt();
	        System.out.print("Enter base of triangle:");
	        base = s.nextInt();
	        area = 0.5 * altitude * base;
	        System.out.println("Area of triangle:"+area);
	    }
	    public static void main(String[] args) 
	    {
	    	String choice;
	    	Scanner obj = new Scanner(System.in);
	    	System.out.print("Enter a choice c=Circle, r=Rectangle, t=Triangle, s=Square :");
	    	choice = obj.next();
	    	Area a = new Area();
	    	if(choice.equals("c")) {
		        a.circle();
	    	}
	    	else if(choice.equals("r")) {
		        a.rectangle();
	    	}
	    	else if(choice.equals("t")) {
		        a.triangle();
	    	}
	    	else if(choice.equals("s")) {
		        a.square();
	    	}
	    	else {
	    		System.out.println("There is nothing to display.");
	    	}   
	    }
	}
