package com.acts.tester;

import java.time.LocalDate;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import com.acts.Bank;
import com.acts.BankExceptions;
import com.acts.BankUtils;
import com.acts.ValidationUtils;
import com.acts.comparators.AccBalanceComparator;
import com.acts.comparators.AccNoComparator;
import com.acts.comparators.AccOpeningDateComparator;
import com.acts.comparators.NameComparator;

public class BankTester {
	public static void main(String[] args) throws BankExceptions {
		LinkedList<Bank> bankList = BankUtils.getBankList();
		Scanner sc = new Scanner(System.in);
		int choice;
		int i=0;
		String userName;
		String accNo;
		String myDate;
		String myBalance;

		do {
			System.out.println("1.Add Account :\n"
					+ "2. Print all Accounts :\n"
					+ "3. Find account :\n"
					+ "4. Delete account :\n"
					+ "5. Sort accounts by account number.\n"
					+ "6. Sort accounts by account opening date.\n"
					+ "7. Sort by balance.\n"
					+ "8. Sort accounts by username.\n"
					+ "9. Fund Transfer\n"
					+ "10. Withdrawl of money\n"
					+ "11. Add Money\n"
					+ "0. Exit.\n");

			System.out.println("Enter your choice :");
			choice = sc.nextInt();

			try {

				switch(choice) {
				case 1:
					System.out.println("Enter Your name : ");
					userName = sc.next();
					System.out.println("Enter your Account No : ");
					accNo = sc.next();
					System.out.println("Enter account opening date. \nPlease enter dob in yyyy-mm-dd format : ");
					myDate = sc.next();
					LocalDate Date = ValidationUtils.validateDate(myDate);
					System.out.println("Enter account Balance : ");
					myBalance = sc.next();

					Bank bankObj = new Bank(accNo, userName, myBalance,Date);
					bankList.add(bankObj);
					break;

				case 2:

					System.out.println("Here is the list  of users : ");
					for(Bank b : bankList) {
						System.out.println(b.toString());
					}
					break;

				case 3:
					String tempAccNo;
					System.out.println("Enter account number to find : ");
					tempAccNo = sc.next();
					Bank b1 = BankUtils.findByAccNo(bankList, tempAccNo);
					System.out.println(b1.getUserName());
					System.out.println(b1);
					break;

				case 4:
					String tempAccNo1;
					System.out.println("Enter account number to delete : ");
					tempAccNo1 = sc.next();
					Bank b2 = BankUtils.deleteByAccNo(bankList, tempAccNo1);
					System.out.println(b2);
					break;

				case 5:
					//					Sort accounts by account number
					Collections.sort(bankList, new AccNoComparator());			
					break;

				case 6:
					//					Sort accounts by account opening date
					Collections.sort(bankList, new AccOpeningDateComparator());

					break;
				case 7:
					//					Sort accounts by account balance
					Collections.sort(bankList, new AccBalanceComparator());

					break;

				case 8:
					//					Sort accounts by account name
					Collections.sort(bankList, new NameComparator());				
					break;

				case 9:
					String tempNo;
					System.out.println("Enter your account number : ");
					tempNo = sc.next();

					Bank b3 = BankUtils.findByAccNo(bankList, tempNo);

					String tempNo1;
					System.out.println("Enter beneficiary account number : ");
					tempNo1 = sc.next();

					Bank b4 = BankUtils.findByAccNo(bankList, tempNo1);

					String amount;
					System.out.println("Enter amount to transfer :");
					amount = sc.next();
					int var1=Integer.parseInt(b3.getUserBalance()); 	//user (b3)
					int var2=Integer.parseInt(b4.getUserBalance()); 	//beneficiary (b4)
					int var3=Integer.parseInt(amount);

					if((b3!= null) && (b4!=null)&&(var1>=var3-1000)) {

						// result = user - amount;
						int var4 = var1 - var3;

						String var5 =String.valueOf(var4);
						b3.setUserBalance(var5);		//user update

						int var6 = var2 + var3;
						String var7 = String.valueOf(var6);

						b4.setUserBalance(var7);		//beneficiary update
						System.out.println("Amount updated successfully.");
					}
					break;

				case 10:
					String tempNo2;
					System.out.println("Enter your account number : ");
					tempNo2 = sc.next();

					Bank z = BankUtils.findByAccNo(bankList, tempNo2);

					int amount1;
					System.out.println("Enter amount to transfer :");
					amount1 = sc.nextInt();
					String tempNo3 = z.getUserBalance();

					int tempNo4 = Integer.parseInt(tempNo3);

					int accAmt = tempNo4 - amount1;

					String tempNo5 = String.valueOf(accAmt);

					z.setUserBalance(tempNo5);

					break;

				case 11:
					String addTempNo2;
					System.out.println("Enter your account number : ");
					addTempNo2 = sc.next();

					Bank addObj = BankUtils.findByAccNo(bankList, addTempNo2);

					int addAmount1;
					System.out.println("Enter amount to transfer :");
					addAmount1 = sc.nextInt();
					String addTempNo3 = addObj.getUserBalance();

					int addTempNo4 = Integer.parseInt(addTempNo3);

					int addAccAmt = addTempNo4 + addAmount1;

					String addTempNo5 = String.valueOf(addAccAmt);

					addObj.setUserBalance(addTempNo5);

					break;

				case 0:
					System.exit(0);
				}
			}
			catch(Exception e){
				e.printStackTrace();
				sc.nextLine();

			}
		}while(choice!=0);
	}
}
