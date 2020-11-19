class Qtwo
{
	public static void main(String[] s)
	{
		Check a=new Check();
		a.count(s);
	}
}

class Check
{
	void count(String[] s)
	{
		String word=new String(s[0]);
		int counter=0;
		for(int i=1; i<s.length; i++)
		{
			if(word.compareTo(s[i])==0)
			{
				counter++;
			}
		}
		System.out.println("Number of " + word + " is " + counter);
	}
}