package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class CalendarConundrum
{
	public static void main(String[] args)
	{
		String data = "10 31 16";
		System.setIn(new ByteArrayInputStream(data.getBytes()));

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > 31) System.out.print("Format #3");
		else if (a > 12)
		{
			if (c > 31) System.out.print("Format #2");
			else System.out.print("Ambiguous");
		}
		else
		{
			if (b > 12) System.out.print("Format #1");
			else System.out.print("Ambiguous");
		}

		sc.close();
		System.exit(0);
	}

}
