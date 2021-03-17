package org.java;

public class Loan extends Bank {
	@Override
	public void goldLoan() {
		// TODO Auto-generated method stub
		System.out.println("12%");
	}
	
	public static void main(String[] args) {
		Loan l = new Loan();
		l.goldLoan();
		l.homeLoan();
	}

}
