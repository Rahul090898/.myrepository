class Task3 
{
	void Fibonacci(){
		int value1 = 0;
		int value2 = 1;
		int i,Newvalue;
		for(i=1;i<=10;i++)
		{
			if(i==1)
			{
				Newvalue=0;
			}
			else{
			Newvalue = value1+value2;
			}
			System.out.print(Newvalue+",");
			value1 = value2;
			value2 = Newvalue;
		}
	}

	public static void main(String[] args) 
	{
		Task3 n = new Task3();
		n.Fibonacci();
	}
}
