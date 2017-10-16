public class BankAccount
{
	private double banlance;
	private String owner;
	private int accountNum;

	public BankAccount()
	{
		//Negative one means no account given
		this(0.0, " ", -1);
	}
	public BankAccount (double banlance, String owner, int accountNum)
	{
		this.banlance = banlance;
		this.owner =  owner;
		this.accountNum =  accountNum;

	}

	//Those are the getters
	public double getBanlance ()
	{
		return this.banlance;
	}
	public String getOwner ()
	{
		return this.owner;
	}
	public int getAccountNum ()
	{
		return this.accountNum;
	}

	//Those are the setters
	public void setOwner (String owner)
	{
		this.owner = owner;
	}
	public void setAccountNum (int accountNum)
	{
		this.accountNum = accountNum;
	}
	public void deposit (double amonut)
	{
		this.banlance += amount;
	}
	public int withdrow (double amount)
	{
		int returnValue = 0;
		if ((this.banlance - amount) < 0)
		{
			//This method will return -1 if there is no enough banlance
			returnValue = -1;
		}
		else
		{
			this.banlacne -= amount;
		}
		return returnValue;
	}
}