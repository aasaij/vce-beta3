package day1;

import java.util.Scanner;

//Simple calculator
// I/P : 10 + 5
//O/P : 10 + 5 = 15
public class SwitchDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int op1, op2,result;
		String opr;
		System.out.println("Enter an expression(10 + 5) :");
		op1 = in.nextInt();
		opr = in.next();
		op2 = in.nextInt();
		
		switch(opr) {
		case "+":
			result = op1 + op2;
			break;
		case "-":
			result = op1 - op2;
			break;
		case "*": case "x": case "X": 
			result = op1 * op2;
			break;
		case "/":
			float ans = op1 / (float)op2;
			System.out.println(op1 + " " + opr + " " + op2 + " = " + ans);			
			return;
		case "%":
			result = op1 % op2;
			break;
		default:
			System.out.println("Invalid expression!");
			return;
		}
		System.out.println(op1 + " " + opr + " " + op2 + " = " + result);
	}
}
/*
	switch(expression) {
	case x:
	  // code block
	  break;
	case y:
	  // code block
	  break;
	default:
	  // code block
	}
*/