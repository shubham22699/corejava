package constructos.java;

public class Customer {
	String cId;
	String cName;
	String itemName;
	double price;
	String status;
	long mobNum;
	
	Customer(){
		
	}
	Customer(String cId,String cName)
	{
		this.cId=cId;
		this.cName=cName;
	}
	Customer(String cId,String cName,String itemName,
			double price,String status,long mobNum)
	{
		this.cId=cId;
		this.cName=cName;
		this.itemName=itemName;
		this.price=price;
		this.status=status;
		this.mobNum=mobNum;
	}
	public String getCName()
	{
		return cName;
	}
	public void setCName(String custmName)
	{
		this.cName=custmName;
	}
	
}
