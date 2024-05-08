package day1;

import java.util.Scanner;
//From Java 14 onwards
public class SwitchExpressionDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op1, op2;
		Integer result;
		String opr;
		System.out.println("Enter an expression(10 + 5) :");
		op1 = in.nextInt();
		opr = in.next();
		op2 = in.nextInt();
		result = switch(opr) {
		case "+" -> op1 + op2;
		case "-" -> op1 - op2;
		case "*", "x", "X" -> op1 * op2;
		case "/" -> op1 / op2;
		case "%" -> op1 % op2;
		default -> null;
		};
		if (result!=null)
			System.out.println(op1 + " " + opr + " " + op2 + " = " + result);
		else
			System.out.println("Invalid Expression!");
	}
}
//3/5/2024
//
//Friday 03, May 2024
//
//32/5/2024  --> Invalid


