package com.atm.demos;

import java.util.Scanner;

	
	//class create
	 class ATM{
		 
		 float Balance;
		 int PIN=12345;
		 
		 public void checkpin()
		 {
			 System.out.println("Enter your pin: ");
			 Scanner sc=new Scanner(System.in);
			 int enteredpin=sc.nextInt();
			 if(enteredpin==PIN)  //for valid to check
			 {
				 menu();
			 }
			 else
			 {
				 System.out.println("Enter a valid pin");
				 menu();
			 }
		 }
		 private void menu()
		 {
			 System.out.println("Enter Your Choice: ");
			 System.out.println("1. Check A/C Balance");
			 System.out.println("2. Withdraw Money");
			 System.out.println("3. Deposit Money");
			 System.out.println("4. Exit");
			 
			 Scanner sc=new Scanner(System.in);
			 int opt=sc.nextInt();
			  if(opt==1)
			  {
				  checkBalance();
				  
			  }
			  else if(opt==2)
			  {
				  withdrawMoney();
			  }
			  else if(opt==3) {
				  depositMoney();
			  }
			  else if(opt==4)
			  {
				  return;
			  }
			  else
			  {
				  System.out.println("Enter avalid choice");
			  }
		 }
		 public void checkBalance() {
			 System.out.println("Balance: " + Balance);
			 menu();
		 }
		 public void withdrawMoney()
		 {
			 System.out.println("Enter Amount to withdraw: ");
			 Scanner sc=new Scanner(System.in);
			 float amount=sc.nextFloat();
			 if(amount>Balance) {
				 System.out.println("Insufficient Balance");
			 }
			 else
			 {
				 Balance = Balance - amount;
				 System.out.println("Withdraw Successfully..");
			 }
			 menu();
		 }
		 
		 public void depositMoney()
		 {
			 System.out.println("Enter the Amount: ");
			 Scanner sc=new Scanner(System.in);
			 float amount=sc.nextFloat();
			 Balance=Balance+amount;
			 System.out.print("Money Deposited Successfully");
			 menu();
		 }
	 
	
	 }
		
 public class ATMmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ATM obj=new ATM();
		obj.checkpin();   //cal pin

	}
}


