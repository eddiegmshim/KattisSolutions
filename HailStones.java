package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class HailStones
{
	public static void main(String[] args)
	{
		String data = "10";
		System.setIn(new ByteArrayInputStream(data.getBytes()));

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = hailStone(n, 0);
		System.out.println(sum);
	}

	public static long hailStone(long n, long totalSum)
	{
		if (n == 0) return 0;
		if (n == 1) return totalSum + 1;
		else if (n % 2 == 0)
		{
			totalSum += n;
			return (hailStone(n / 2, totalSum));
		}
		else
		{
			totalSum += n;
			return (hailStone(3 * n + 1, totalSum));
		}
	}
}
