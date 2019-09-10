package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreedyHike
{
	public static void main(String[] args)
	{
		String data = "4 4\r\n" + "1 0\r\n" + "0 2 10 15\r\n" + "0 10 15 20\r\n" + "0 3 3 3\r\n" + "0 10 10 10";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> grid = new ArrayList<List<Integer>>();
		List<Integer> row = new ArrayList<Integer>();

		int lengthX = sc.nextInt();
		int lengthY = sc.nextInt();
		int positionX = sc.nextInt();
		int positionY = sc.nextInt();
		int totalAbsoluteChange = 0;

		for (int xIndex = 0; xIndex < lengthX; xIndex++)
		{
			for (int yIndex = 0; yIndex < (lengthY); yIndex++)
			{
				row.add(sc.nextInt());
			}
			grid.add(row);
			row = new ArrayList<Integer>();
		}

		while (positionY < lengthY - 1)
		{
			int currentElevation = grid.get(positionX).get(positionY);
			int positionXMinus1 = Math.max(0, positionX - 1);
			int positionXPlus = Math.min(lengthX - 1, positionX + 1);

			int xMinus1Change = Math.abs(grid.get(positionXMinus1).get(positionY + 1) - currentElevation);
			int xZeroChange = Math.abs(grid.get(positionX).get(positionY + 1) - currentElevation);
			int xPlus1Change = Math.abs(grid.get(positionXPlus).get(positionY + 1) - currentElevation);

			int minAbsoluteChange = Math.min(Math.min(xMinus1Change, xZeroChange), xPlus1Change);
			if (minAbsoluteChange == xZeroChange)
			{
				// stay on X
			}
			else if (minAbsoluteChange == xPlus1Change)
			{
				positionX = positionXPlus;
			}
			else
			{
				positionX = positionXMinus1;
			}

			positionY++;
			totalAbsoluteChange += minAbsoluteChange;

		}
		System.out.print(positionX + " " + positionY + " " + totalAbsoluteChange);

	}

}
