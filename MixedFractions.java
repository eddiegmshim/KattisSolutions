package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class MixedFractions
{
	public static void main(String[] args)
	{
		String data = "1 2 \n 5 2 \n 0 0";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt())
		{
			int input1 = sc.nextInt();
			int input2 = sc.nextInt();
			if (input1 == 0 && input2 == 0) System.exit(0);

			int divisor = input1 / input2;
			int remainder = input1 % input2;

			System.out.print(divisor + " " + remainder + " / " + input2 + "\n");
		}
	}
}
