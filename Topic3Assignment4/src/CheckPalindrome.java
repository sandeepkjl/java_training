
public class CheckPalindrome {
	public static void main(String args[])
	{
		String s = args[0];
		int c=0;
		
		for(int i=0 ; i<s.length() ;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				c=1;
			}

		}
		
		if(c==0)
		{
			System.out.println("String is Palindrome");
		}
		else{
			System.out.println("String is not Palindrome");
		}
	}

}
