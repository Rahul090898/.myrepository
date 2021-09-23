class Task4 
{
	void swapping(){
		int Num1 = 12;
		int Num2 = 15;
		System.out.println("Before Swapping Num1 is "+Num1+" "+"Num2 is "+Num2);
		Num1 = Num1+Num2;
		Num2 = Num1-Num2;
		Num1 = Num1-Num2;
		System.out.print("After Swapping Num1 is "+Num1+" "+"Num2 is "+Num2+"  ");
	}
	public static void main(String[] args) 
	{
		Task4 a = new Task4();
		a.swapping();
	}
}
