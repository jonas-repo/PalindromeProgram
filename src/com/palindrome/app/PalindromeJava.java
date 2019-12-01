package com.palindrome.app;

public class PalindromeJava {
	
	
	public static void main(String args[])
	{
		String palindrome1 = "Anita lava la tina";
		String palindrome2 = "La ruta natural";
		String noPalindrome = "rambo tampo zampo";
		System.out.println(isPalindrome(palindrome1)); //true
		System.out.println(isPalindrome(palindrome2)); //true
		System.out.println(isPalindrome(noPalindrome));//false
	}
	
	public static boolean isPalindrome(String palindrome)
	{
		palindrome = palindrome.replaceAll(" ", "");
		palindrome = palindrome.toLowerCase();
		
		char[] lettersFromPalindrome = palindrome.toCharArray();
		int fromLengh = lettersFromPalindrome.length-1;
		boolean itIsPalindrome = true;
		
		for(char caracter : lettersFromPalindrome) //iterate over the array
		{
			//compare character from opposite positions 
			if(caracter != lettersFromPalindrome[fromLengh]) //if there is one character different is not palindrome
			{
				itIsPalindrome = false;
				break;
			}
			fromLengh--;
		}
	
		return itIsPalindrome;
	}
}

