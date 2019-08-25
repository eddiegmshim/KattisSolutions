package placementStudy;

import java.util.Scanner;

public class ColdputerScience
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		int lowTempCounter = 0;
		while (sc.hasNextInt())
		{
			if (sc.nextInt() < 0) lowTempCounter++;
		}
		System.out.println(lowTempCounter);
	}
}