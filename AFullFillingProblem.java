package placementStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AFullFillingProblem
{
	public static void main(String[] args)
	{
//		String data = "10 4 0\n7 2 2 1 1 1 1 2 3 5";
//		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner sc = new Scanner(System.in);
		int array_length = sc.nextInt();
		int index = sc.nextInt();
		int new_value = sc.nextInt();
		List<Integer> array = new ArrayList<>();

		while (sc.hasNextInt())
		{
			array.add(sc.nextInt());
		}

		int original_value = array.get(index);
		fill(array, index, original_value, new_value, array_length);
		for (int i = 0; i < array.size(); i++)
		{
			System.out.print(array.get(i) + " ");
		}

		sc.close();
		System.exit(0);
	}

//	Params: ArrayList a, index i, original value v, new value x
	public static void fill(List<Integer> a, int i, int v, int x, int size)
	{
		if (i < 0 || i >= size) return;
		if (a.get(i) != v || a.get(i) == x) return;

		a.set(i, x);
		fill(a, i - 1, v, x, size);
		fill(a, i + 1, v, x, size);
	}

}
