/*5. Define a class to represent a bank ACCOUNT and include the following members:
I. Data Members(States):
a) Name of Depositor
b) Account number
c) Type of Account
d) Balance amount in the account
II. Member Methods(Behaviors):
a) To assign initial values
b) To deposit an amount
c) To withdraw an amount after checking for the balance
d) To display name &amp; balance
III. Define EXECUTEACCOUNT class that defines main method to test above class.
IV. In the above class, maintain the total number of account holders present in the bank and
also define a method to define it. Change the main method appropriately.
V. In main method of EXECUTEACCOUNT class, define an array to handle five accounts. */

import java.util.Scanner;
class Account {
    private String accno;
    private String name;
    private long balance;
    private String acctype;

    Scanner in = new Scanner(System.in);
    Account(){
      
    }

    
    void openAccount() {
        System.out.print("Enter Account No: ");
        this.accno = in.next();
        System.out.print("Enter Name: ");
        this.name = in.next();
        System.out.print("Enter Account Balance: ");
        this.balance = in.nextLong();
        System.out.println("enter account type");
        this.acctype = in.next();
        
    }

    
    void showAccount() {
       
	System.out.println("Account number is :"+this.accno);
	System.out.println("Name :"+this.name);
	System.out.println("Account balance is :"+this.balance);
	System.out.println("Account type is :"+this.acctype);		
	System.out.println("-------------------------------------------------------");
    }

     void deposit() {
        long amt;
        System.out.println("amount you want to deposit : ");
        amt = in.nextLong();
	if(amt<0)
	{
		System.out.println("Can't deposit an invalid amount");
		System.out.println("-------------------------------------------------------");
		return;
    }
    balance = balance + amt;
    }

    
    void withdrawal() {
        long amt;
        System.out.println("amount you want to withdraw : ");
        amt = in.nextLong();
        if (balance >= amt&&amt>0) {
            balance = balance - amt;
        } else {
            System.out.println("Transaction Failed..");
	System.out.println("-------------------------------------------------------");
        }
    }

    
    boolean search(String acn)
    {
        if (accno.equals(acn))
        {
            showAccount();
            return (true);
        }
        return (false);
    }
}

public class Execute_account {
    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        
        System.out.print("number of Customer you Want to Input : ");
        int n = in.nextInt();
         Account C[] = new Account[n];
        for (int i = 0; i < C.length; i++) 
        {
           C[i] = new Account();
            C[i].openAccount();
        }

        
        int ch;
        do {
            System.out.println("Main Menu\n1. Display All\n 2. Search By Account\n 3. Deposit\n 4. Withdrawal\n 5.Exit ");
            System.out.println("your Choice :"); ch = in.nextInt();
                switch (ch) {
                    case 1:
                        for (int i = 0; i < C.length; i++) {
                            C[i].showAccount();
                        }
                        break;

                    case 2:
                        System.out.print("Enter Account number you Want to Search...: ");
                        String acn = in.next();
                        boolean found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Does Not Exist..");
                        }
                        break;
                    case 3:
                        System.out.print("Enter Account No : ");
                        acn = in.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].deposit();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed, Account doesnot Exist..");
                        }
                        break;

                    case 4:
                        System.out.print("Enter Account No : ");
                        acn = in.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].withdrawal();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed Account doesnot Exist..");
                        }
                        break;

                    case 5:
                        System.out.println("thank you");
                        break;
			default:System.out.println("Wrong input");
                }
            }
            while (ch != 5);
        }
    }    

