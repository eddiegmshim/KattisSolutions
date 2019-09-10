package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class TrickyProblem
{
	public static void main(String[] args)
	{
		String data = "3\n" + "2 2 2\n" + "A A A";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner sc = new Scanner(System.in);
		ArrayList<String> player1 = new ArrayList<String>();
		ArrayList<String> player2 = new ArrayList<String>();
		int roundTally = 0;

		int numberRounds = sc.nextInt();
		for (int round = 0; round < numberRounds; round++)
		{
			player1.add(sc.next());
		}
		for (int round = 0; round < numberRounds; round++)
		{
			player2.add(sc.next());
		}

		for (int round = 0; round < numberRounds; round++)
		{
			if (changeValuesToInteger(player1.get(round)) < changeValuesToInteger(player2.get(round))) roundTally++;
			else if (changeValuesToInteger(player1.get(round)) > changeValuesToInteger(player2.get(round)))
				roundTally--;
		}

		if (roundTally > 0) System.out.print("PLAYER 2 WINS");
		else if (roundTally < 0) System.out.print("PLAYER 1 WINS");
		else System.out.print("TIE");

		sc.close();
	}

	public static int changeValuesToInteger(String s)
	{
		if (s.equals("J")) return 10;
		if (s.equals("Q")) return 11;
		if (s.equals("K")) return 12;
		if (s.equals("A")) return 13;
		else return Integer.valueOf(s);
	}

}
