package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class HelpPhdCandidate
{
	public static void main(String[] args)
	{
		String data = "2\n10+2\nP=NP";

		System.setIn(new ByteArrayInputStream(data.getBytes()));

		Scanner sc = new Scanner(System.in);
		int linesAvailable = Integer.valueOf(sc.nextLine());

		for (int counter = 0; counter < linesAvailable; counter++)
		{
			String nextLine = sc.nextLine();
			if (nextLine.equals("P=NP")) System.out.println("skipped");
			else
			{
				int indexOfPlus = nextLine.indexOf("+");
				int first = Integer.valueOf(nextLine.substring(0, indexOfPlus));
				int second = Integer.valueOf(nextLine.substring(indexOfPlus + 1, nextLine.length()));
				System.out.println(first + second);
			}
		}

	}
}
