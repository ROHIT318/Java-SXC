class Qfour
{
	public static void main(String[] s)
	{
		int a[]=new int[s.length];
		for(int i=0; i<s.length; i++)
		{
			a[i]=Integer.parseInt(s[i]);
		}
		Arrange arr = new Arrange(a);
		arr.sort();
		arr.show();
	}
}

class Arrange
{
	private int s[];
	Arrange(int arr[])
	{
		this.s=arr;
	}
	void sort()
	{
		int ptr;
		for(int i=0; i<s.length-1; i++)
		{
			int index=i;
			for(int j=i+1; j<s.length; j++)
			{
				if(s[i] < s[j])
				{
					ptr=s[i];
					s[i]=s[j];
					s[j]=ptr;
				}
			}
		}
	}
	void show()
	{	
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
	}
}