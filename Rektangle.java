import java.util.Scanner;
public class Rektangle {
public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
int width = 0;
int height = 0 ;
int perimeter = 0;
int area = 0;
System.out.println("Please imput the width ");
width = keyboard.nextInt();
System.out.println("Please imput the height ");
height = keyboard.nextInt();
perimeter =2 * (height+width);
area = height * width;
System.out.println("Perimeter of this rectangle is " + perimeter);
System.out.println("Area of this rectange is " + area);
	    }
	    	}
