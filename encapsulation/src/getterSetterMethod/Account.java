package getterSetterMethod;

public class Account {
	public long accountNum;
	public String custmName;
	
	Account(){
		System.out.println("From default constructor");
		this.accountNum=705727500;
		this.custmName="Shubham";
	}
    
	Account(long accountNum,String custmName)
	{
		System.out.println("From paramatherised constructor 1");
		this.accountNum=accountNum;
		this.custmName=custmName;
	}
	Account(long accountNum)
	{
		System.out.println("From Paramathrised constructor 2");
		this.accountNum=accountNum;
		this.custmName="Shubham";
	}
	public long getAccountNum()
	{
		return accountNum;
	}
	public void setAccountNum(long accountNum)
	{
		this.accountNum=accountNum;
	}
	public String getCustmName()
	{
		return custmName;
	}
	public void setCustmName(String custmName)
	{
		this.custmName=custmName;
	}
	/*public String toString()
	{
		return "Account number: "+accountNum+" custmer name: "+custmName;
	}*/

}
