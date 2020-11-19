class Qfive
{
	public static void main(String[] s)
	{
		String str=new String(s[0]);
		Show a=new Show();
		a.patterns(str);
	}
}

// make different methods for different patterns
class Show
{
	void patterns(String str)
	{	
		System.out.println("--------------------------------1------------------------------");	
		// 1
		for(int i=0; i<str.length(); i++)
		{
			System.out.println(str.substring(i, 7));
		}
	
		System.out.println("--------------------------------2------------------------------");		
		// 2
		for(int i=0; i<=str.length(); i++)
		{
			System.out.println(str.substring(0, i));
		}

		System.out.println("--------------------------------3------------------------------");
		// 3
		for(int i=str.length(); i>=0; i--)
		{
			System.out.println(str.substring(0, i));
		}


		System.out.println("--------------------------------4------------------------------");
		// 4
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.println(str.substring(i));
		}
	}
}	