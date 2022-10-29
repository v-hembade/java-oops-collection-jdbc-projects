package bank;
import java.io.*;
import java.util.*;
public class Application 
{

	public static void main(String[] args) 
	{
		String name;
		String city;
		int amount;
		int accnum;
		boolean found;
		ArrayList<Account> list = new ArrayList<>();
		list.add(new Account("rahul kumar","pune",1000));
		list.add(new Account("raj kumar","mumbai",2000));
        Scanner input = new Scanner(System.in);
        int choice;
        do
        {
        	System.out.println("----------------------------------------");
        	System.out.println("1. create Account");
            System.out.println("2. Debit");
            System.out.println("3. credit");
            System.out.println("4. check balance");
            System.out.println("5. list of all account");
            System.out.println("6. Exit");
            System.out.println("----------------------------------------");
        	System.out.println("Enter Your Choice:");
        	choice = input.nextInt();
        	switch(choice)
        	{
        		case 1: 
        			System.out.println("Enter Name:");
        			name = input.next();
        			System.out.println("Enter city:");
        			city = input.next();
        			System.out.println("Enter amount:");
        			amount = input.nextInt();
        			Account accc = new Account(name,city,amount);
        			list.add(accc);
        			System.out.println("-------Account Created------");
        			break;
        		case 2: 
        			System.out.println("------Account Debit--------");
        			System.out.println("Enter AccountNO");
        			found=false;
        			accnum = input.nextInt();
        			for(Account ac : list)
        			{
        				if(accnum==ac.getAccno())
        				{
        					found=true;
        					System.out.println("Enter Amount");
        					int a = input.nextInt();
        					ac.setBalanace(ac.getBalanace()+a);
        					System.out.println("Amount debited successfully");
        					break;
        				}
        				
        			}
        			if(!found)
    				{
    					System.out.println("Enter Correct Account Number");
    					break;
    				}
        			
        			break;
        		case 3: 
        			System.out.println("-----Account Credit-------");
        			System.out.println("Enter AccountNO:");
        			found=false;
        			accnum = input.nextInt();
        			for(Account ac : list)
        			{
        				if(accnum==ac.getAccno())
        				{
        					found=true;
        					System.out.println("Enter Amount to Credit");
        					int a = input.nextInt();
        					if(a <= ac.getBalanace())
        					{
        						ac.setBalanace(ac.getBalanace()-a);
        						System.out.println("Ammount credited Successfully");
        						break;
        					}
        					else
        					{
        						System.out.println("Invalid amount");
        						break;
        					}
        				}
        				
        			}
        			if(!found)
    				{
    					System.out.println("Invalid Account NO");
    					
    				}
        			
        			break;
        		case 4: 
        			System.out.println("----current balance------");
        			System.out.println("Enter AccountNO:");
        			found=false;
        			accnum = input.nextInt();
        			for(Account ac : list)
        			{
        				if(accnum==ac.getAccno())
        				{
        					found=true;
        				    System.out.println(" Your Current Balance is : " + ac.getBalanace());
        					break;
        				}
        				
        			}
        			if(!found)
    				{
    					System.out.println("Enter Correct Account Number");
    				}
        			break;
        		case 5: 
        			System.out.println(list);
        			
        			break;
        		case 6:
        			System.out.println("-------------Thank You------------");
        		default: 
        			System.out.println("invalid option");
        			break;
        	}
        		
        	
        }
        while(choice!=6);
	}

}
