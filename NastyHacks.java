package placementStudy;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class NastyHacks
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int lineCounter = 0;
		while (sc.hasNext())
		{
			if (lineCounter == 0) sc.nextLine();
			else
			{
				long revNoAdvertise = sc.nextLong();
				long revAdvertise = sc.nextLong();
				long cost = sc.nextLong();

				if (revNoAdvertise > revAdvertise - cost) System.out.println("do not advertise");
				else if (revNoAdvertise < revAdvertise - cost) System.out.println("advertise");
				else System.out.println("does not matter");
			}
			lineCounter++;
		}
		sc.close();

	}

	public static void testInput()
	{
		String data = "2\n0 100 70\n100 130 30";

		InputStream input = System.in;
		System.setIn(new ByteArrayInputStream(data.getBytes()));

		Scanner sc = new Scanner(System.in);
		int lineCounter = 0;
		while (sc.hasNext())
		{
			System.out.println(sc.nextLine());
		}
	}
}
