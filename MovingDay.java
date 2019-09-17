package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MovingDay
{
	public static void main(String[] args)
	{
		String data = "4 980\n 10 10 10\n 10 5 2\n 5 3 2\n 90 5 2";
		System.setIn(new ByteArrayInputStream(data.getBytes()));

		Scanner sc = new Scanner(System.in);

		int numberOfBoxes = sc.nextInt();
		long largeV = sc.nextInt();
		long maxVolume = 0;

		for (int boxCount = 0; boxCount < numberOfBoxes; boxCount++)
		{
			long length = sc.nextLong();
			long width = sc.nextLong();
			long height = sc.nextLong();
			if (length * width * height > maxVolume) maxVolume = length * width * height;
		}

		System.out.println(maxVolume - largeV);
	}
}
