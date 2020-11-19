class Qthree
{
	public static void main(String[] s)
	{
		Abbr a=new Abbr();
		a.abbreviate(s);
	}
}

class Abbr
{
	void abbreviate(String[] s) 
	{
		for(int i=0; i<s.length; i++)
		{
			System.out.print(s[i].toUpperCase().charAt(0) + ".");
		}
	}
}