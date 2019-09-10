package placementStudy;

import java.util.Scanner;

public class NinetyOne
{
	public static void main(String[] args)
	{
//		String data = "20";
//		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner sc = new Scanner(System.in);
		System.out.print(functionM(sc.nextInt()));
	}

	public static int functionM(int input)
	{
		if (input > 100) return input - 10;
		else return functionM(functionM(input + 11));
	}
}
