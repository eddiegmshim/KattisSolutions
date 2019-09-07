package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MartingaleBettingStrategy
{
	public static void main(String[] args)
	{
		String data = "140\r\n" + "20\r\n" + "8\r\n" + "0 0 0 1 0 1 1 1";
		System.setIn(new ByteArrayInputStream(data.getBytes()));

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // money available
		int b = sc.nextInt(); // starting bet
		int b_1 = b; // initial bet
		int n = sc.nextInt(); // number of rounds
		while (sc.hasNextInt())
		{
			int coinResult = sc.nextInt();
			if (coinResult == 1)
			{
				m += b;
				b = Math.min(b_1, m);
			}
			else
			{
				m -= b;
				b = Math.min(2 * b, m);
			}

			if (m <= 0)
			{
				System.out.print("BROKE");
				System.exit(0);
			}
		}
		System.out.print(m);
	}
}
