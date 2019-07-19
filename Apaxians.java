package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Apaxians
{
	public static void main(String[] args)
	{
		String data = "rooobert";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String compactName = input.charAt(0) + "";
		for (int counter = 0; counter < input.length() - 1; counter++)
		{
			char first = input.charAt(counter);
			char second = input.charAt(counter + 1);
			if (first != second) compactName += second;
		}
		System.out.println(compactName);
	}
}