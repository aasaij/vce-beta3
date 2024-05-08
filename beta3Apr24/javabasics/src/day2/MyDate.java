package day2;

public class MyDate {
	private int dd, mm, yy;
	
	//Default constructor
	public MyDate() {
		
	}
	//Constructor overloading
	//Parameterized constructor
	public MyDate(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	private boolean isLeapYear(int y) {
		return y % 400 == 0 || (y % 4 ==0 && y % 100 != 0);
	}
	private boolean isValid(int d, int m, int y) {
		if (d< 1|| d > 31 || m < 1 || m > 12 || y < 1)
			return false;
		else {
			switch(m) {
			case 4,6,9,11:
				if ( d > 30)
					return false;
				break;
			case 2:
				if (isLeapYear(y)) {
					if ( d > 29)
						return false;
				}
				else if ( d > 28)
					return false;
			}
			return true;
		}
	}

	public int getDay() {
		return dd;
	}

	public void setDay(int dd) {
		this.dd = dd;
	}

	public int getMM() {
		return mm;
	}

	public void setMM(int mm) {
		this.mm = mm;
	}

	public int getYear() {
		return yy;
	}

	public void setYear(int yy) {
		this.yy = yy;
	}
	public int getWeekDay() {
		int f, m, D, C, y;
		if (mm==1 || mm==2) {
			m = mm + 10;
			y= yy-1;
		}
		else {
			m = mm - 2;
			y = yy;
		}
		D = y % 100;
		C = y / 100;
		f = (dd + (13*m-1)/5 + D + D/4 + C/4-2*C)%7;
		if (f < 0)
			f+=7;
		return f;
	}
	public String getDayOfWeek() {
		String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		return days[getWeekDay()]; 		
	}
	public String getMonth() {
		String months[] = {"","January", "February", "March", "April", "June","July","August",
				"September", "November", "December"};
		return months[mm];
	}
	public boolean setDate(int d, int m, int y) {
		if (isValid(d, m,y)) {
			dd = d;
			mm = m;
			yy = y;
			return true;
		}
		return false;
	}
	public boolean setDate(String sdate) {
		String dates[] = sdate.split("/");
		int dd = Integer.parseInt(dates[0]);
		int mm = Integer.parseInt(dates[1]);
		int yy = Integer.parseInt(dates[2]);
		return setDate(dd, mm, yy);
	}
	@Override
	public String toString() {
		return dd + "/" + mm + "/" + yy;
	}
}
