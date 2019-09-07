package placementStudy;

import java.util.Scanner;

public class RecursivePalindrome
{
	public static void main(String[] args)
	{
//		String data = "xoox";
//		System.setIn(new ByteArrayInputStream(data.getBytes()));

		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		if (checkPalindrome(input)) System.out.println("PALINDROME");
		else System.out.println("NOT PALINDROME");
	}

	public static Boolean checkPalindrome(String s)
	{
		if (s.length() == 1) return true;
		else if (s.length() == 2)
		{
			if (s.substring(0, 1).equals(s.substring(1, 2))) return true;
			else return false;
		}
		else
		{
			if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length())))
			{
				return (checkPalindrome(s.substring(1, s.length() - 1)));
			}
			else return false;
		}
	}
}
