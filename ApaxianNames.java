package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ApaxianNames
{
	public static void main(String[] args)
	{
		String data = "ios\r\n" + "3\r\n" + "apalaxios\r\n" + "menolaxios\r\n" + "somolaxios";
		System.setIn(new ByteArrayInputStream(data.getBytes()));

		Scanner sc = new Scanner(System.in);
		String communityName = sc.next();
		int numberOfNames = sc.nextInt();

		int princessCount = 0;
		int baronCount = 0;
		int priestCount = 0;
		int commonerCount = 0;

		while (sc.hasNext())
		{
			String name = sc.next();
			if (name.contains(communityName))
			{
				int index = name.indexOf(communityName);
				if (index == 0) princessCount++;
				else if (index == (name.length() - communityName.length())) baronCount++;
				else priestCount++;
			}
			else commonerCount++;
		}

		System.out.print(princessCount + " PRINCESS\n" + baronCount + " BARON\n" + priestCount + " PRIEST\n"
				+ commonerCount + " COMMONER");
	}
}
