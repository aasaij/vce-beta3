package day3;

import java.io.Console;

public class UnCheckedExceptionDemo {

	public static void main(String[] args) {
		int x, y, z;
		Console con = System.console();
		try{
		    x = Integer.parseInt(con.readLine());
		    y = Integer.parseInt(con.readLine());
		    z = x / y;
		    System.out.printf("%d / %d = %d\n",x,y, z);
		}catch(ArithmeticException ex){ //handling ArithmeticException here
		    System.out.println("Divisor cannot be zero!");
		}
		catch(NumberFormatException ex){ //handling NumberFormatException here
		    System.out.println("Enter digits only");
		}
		catch(Exception ex){ //handling UnknownError here
		    System.out.println("Unknown Error!");
		}
		finally
		{
		    System.out.println("This is finally block");
		}
		
		System.out.println("Thank you for being very silent!!!");
		System.out.println("Thank you again for being very active in the class");
		
	}

}
