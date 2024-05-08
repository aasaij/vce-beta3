package day4;

public class StringReverse1 {
	static String reverse(String s) {
		if (s.length()==0)
			return "";
		else
			return s.charAt(s.length()-1) + reverse(s.substring(0,s.length()-1));
	}
	public static void main(String[] args) {
		String str = new java.util.Scanner(System.in).next();
		//Method 1
//		for (int i = str.length()-1; i>=0; i--)
//			System.out.print(str.charAt(i));
		//method 2
//		StringBuffer sb = new StringBuffer(str);
//		sb.reverse();
//		str = new String(sb);
//		System.out.println(str);
		//Method 3
		
		str = reverse(str);
		System.out.println(str);
	}
}

//Quiz Link : https://bit.ly/4dpsOMj
//	
//Attendance : https://bit.ly/PA-070524
//Trainer : Tambi
//Session : FN
//
//student.ccc.training --> My Goals



