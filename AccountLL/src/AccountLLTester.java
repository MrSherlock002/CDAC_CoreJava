import java.util.ArrayList;
import java.util.Scanner;
public class AccountLLTester {
	public static void main(String[] args) {
		String accno;
		String username;
		String phno;
		String balance;
		int choice;
		
		ArrayList <String> bank = new ArrayList<>();
		ArrayList<String> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("1. Add user \n 2. print user\n 0.exit");
			System.out.println("Enter your choice : ");
			choice = sc.nextInt();

			switch(choice) {
			case 1:

				System.out.println("Enter your Account Number : ");
				accno=sc.next();
				System.out.println("Enter your username : ");
				username = sc.next();
				System.out.println("Enter your phone number : ");
				phno = sc.next();

				System.out.println("Enter your balance : ");
				balance = sc.next();

				
				bank.add(accno);
				list.add(username);
				list.add(phno);
				list.add(balance);


				break;

			case 2:
				//System.out.println(list);

				boolean b = bank.addAll(list);
				System.out.println(bank);
				break;

			case 0:
				System.exit(0);
				break;
			}

		}while(choice !=0);
	}
}

