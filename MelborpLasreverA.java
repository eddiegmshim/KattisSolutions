package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MelborpLasreverA
{
	public static void main(String[] args)
	{
		String data = "asd";
		System.setIn(new ByteArrayInputStream(data.getBytes()));

		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		reverseString(input, input.length());

		sc.close();
		System.exit(0);
	}

	public static void reverseString(String s, int n)
	{
		if (n == 1)
		{
			System.out.print(s.charAt(0));
			return;
		}
		else
		{
			reverseString(s.substring(1, s.length()), s.length() - 1);
			System.out.print(s.charAt(0));
		}

	}

}
