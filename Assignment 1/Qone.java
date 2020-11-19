class Qone 
{
	public static void main(String[] s)
	{
		Count a=new Count();
		a.count(s);
	}
}

class Count
{
	void count(String[] s)
	{
		for(int i=0; i<s.length; i++)
		{
			if(s[i].indexOf('e')!=-1)
			{
				System.out.println(s[i]);
			}
		}
	}
}