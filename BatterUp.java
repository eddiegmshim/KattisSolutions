package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class BatterUp
{
	public static void main(String[] args)
	{
		String data = "3\n5 2 -1";
		System.setIn(new ByteArrayInputStream(data.getBytes()));

		Scanner sc = new Scanner(System.in);
		int plateAppearances = sc.nextInt();
		int totalPlates = 0;

		while (sc.hasNextInt())
		{
			int nextInput = sc.nextInt();
			if (nextInput < 0) plateAppearances--;
			else totalPlates += nextInput;
		}

		System.out.println((double) totalPlates / (double) plateAppearances);
	}
}
