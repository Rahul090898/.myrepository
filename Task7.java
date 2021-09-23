class Task7 
{
	public static void main(String[] args) 
	{
		int i,j,k,a=0,n=5;
		for(i=1;i<=n;i++)
		{
			k=1;
			for(j=1;j<=i;j++)
			{
				if(j==1){
					a = i;
					System.out.print(a+" ");
				}
				else{
					a = a + (n-k);
					k++;
					System.out.print(a+" ");
				}
			}

			System.out.print("\n");
		}
		
	}
}
