package placementStudy;

import java.util.Scanner;

public class NobleHouses
{
	public static void main(String[] args)
	{
//		String data = "menolaxios mox";
//		System.setIn(new ByteArrayInputStream(data.getBytes()));

		Scanner sc = new Scanner(System.in);
		String firstName = sc.next();
		String lastName = sc.next();
		int lastNameLength = (lastName.length() != 5) ? lastName.length() : 4;
		String lastNameModified = "";

		for (int counter = 0; counter < lastNameLength; counter++)
		{
			lastNameModified += lastName;
		}

		System.out.print(firstName + " " + lastNameModified);
	}

}
