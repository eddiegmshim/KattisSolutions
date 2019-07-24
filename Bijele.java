package placementStudy;

import java.util.Scanner;

public class Bijele
{
	public static void main(String[] args)
	{
//		String data = "1 1 2 2 3 8";
//		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner sc = new Scanner(System.in);
		int inputCounter = 0;
		while (sc.hasNextInt())
		{
			int input = sc.nextInt();
			if (inputCounter < 2) System.out.print(1 - input + " ");
			else if (inputCounter < 5) System.out.print(2 - input + " ");
			else if (inputCounter == 5) System.out.print(8 - input + " ");
			inputCounter++;
		}
		sc.close();
	}
}
