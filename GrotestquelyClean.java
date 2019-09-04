package placementStudy;

import java.util.Scanner;

public class GrotestquelyClean
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cleanSum = 0;

		while (sc.hasNextInt())
		{
			int score = sc.nextInt();
			if (score == 6)
			{
				System.out.print("CLEAN");
				System.exit(0);
			}

		}
	}

}
