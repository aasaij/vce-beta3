package day3;

public class Bank {
	private long acNumber; 
	private String acName, acType;
	double balance;
	
	//constructor -- default constructor
	public Bank(){
		this(0,"", "", 0); // calling same class constructor
	}	
	//Parameterized constructor or constructor overloading
	public Bank(long acNumber, String acName, String acType, double initalAmount) {
		this.acNumber = acNumber;
		this.acName = acName;
		this.acType = acType;
		balance = initalAmount;
	}




	//	getters

	public String getAcName() {
		return acName;
	}

	public void setAcName(String acName) {
		this.acName = acName;
	}

	public long getAcNumber() {
		return acNumber;
	}

	public String getAcType() {
		return acType;
	}

	public double getBalance() {
		return balance;
	}
	
	
}
