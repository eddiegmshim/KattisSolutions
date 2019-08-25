package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class CGRatio
{
	public static void main(String[] args)
	{
		String data = "2\nGCATCGCG";
		System.setIn(new ByteArrayInputStream(data.getBytes()));

		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		int cgCounter = 0;
		int totalCounter = 0;

		while (sc.hasNextLine())
		{
			String nextLine = sc.nextLine();
			for (int counter = 0; counter < nextLine.length(); counter++)
			{
				char dna = nextLine.charAt(counter);
				if (dna == 'C' || dna == 'G') cgCounter++;
				totalCounter++;
			}
		}
		System.out.println(100 * (double) cgCounter / (double) totalCounter);
		sc.close();
	}
}