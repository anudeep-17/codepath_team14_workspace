package codepath_problems;


//if we can use the pre-build methods of the java langugae 

public class palindromes 
{
	public static void main(String[] args)
	{
		System.out.println(ispalindrome("A man, a plan, a canal: Panama"));
		System.out.println(ispalindrome("race a car"));
		System.out.println(ispalindrome("anudeep"));
	}
	
	public static boolean ispalindrome(String input)
	{
		
		
		if(input.isEmpty())
		{
			return true;
		}
		input = removeAllNonAlphaNumeric(input);
		input = input.toLowerCase();
		String reversed = new StringBuffer(input).reverse().toString();
		
		return input.equals(reversed);
	}
	
	 public static String removeAllNonAlphaNumeric(String s) {
	        if (s == null) {
	            return null;
	        }
	        return s.replaceAll("[^A-Za-z0-9]", "");
	    }

}
