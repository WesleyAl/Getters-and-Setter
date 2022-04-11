package entities;

public class Tools {

	private int accNumber;
	private double balance;
	public String name;
	
	
	public void Decrease(double balance) {
		this.balance = (this.balance - balance)-5;
	}
	
	public void Addition(double balance) {
		this.balance = balance + this.balance;
	}


	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public void accountData() {
		System.out.println("Updated Account data: ");
		System.out.println("Account: " +accNumber + ", Holder: " + name + ", " + "Balance: R$ " + String.format("%.2f", this.balance));
	}

	
}