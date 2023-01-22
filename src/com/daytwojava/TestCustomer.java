package com.daytwojava;

public class TestCustomer {
public static void main(String args[]) {
	Customer c1  = new Customer();
	c1.setcId(101);
	c1.setName("Rohith");
	Account account = c1.getAccount();
	account.setAcctNumber(123456);
	account.setBalance(5000);
	System.out.println(c1.getcId()+" "+c1.getName()+" "+c1.getAccount().getAcctNumber()+" "+c1.getAccount().getBalance());
}
}
