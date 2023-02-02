package getterSetterMethod;

public class AccountDriver {

	public static void main(String[] args) 
	{
		Account a1=new Account();
		System.out.println(a1.accountNum);
		System.out.println(a1.custmName);
		
		System.out.println("=====================");
		
		Account a2=new Account(345456,"amar");
		System.out.println(a2.getAccountNum()+" "+a2.getCustmName());
		System.out.println("=====================");
		
		a2.setCustmName("Shubham");
		System.out.println(a2.getAccountNum()+" "+a2.getCustmName());
		System.out.println("=====================");
		
		System.out.println(a2);
		System.out.println("=====================");
		
		System.out.println(a2.toString());
	}

}
