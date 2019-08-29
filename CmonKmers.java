package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CmonKmers
{
	public static void main(String[] args)
	{
		String data = "1 7 2 3\r\n" + "aaabaab\r\n" + "ab\r\n" + "ba\r\n" + "aa";
		System.setIn(new ByteArrayInputStream(data.getBytes()));

		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(); // number of lines in input
		int N = sc.nextInt(); // number of characters in input
		int k = sc.nextInt(); // k-mer value
		int Q = sc.nextInt(); // number of k-mers to count
		String totalStringInput = "";
		List<String> kmerListWanted = new ArrayList<>();
		Map<String, Integer> kmerMapAll = new TreeMap<>();

		for (int counterL = 0; counterL < L; counterL++)
		{
			totalStringInput += sc.next();
		}

		for (int counterQ = 0; counterQ < Q; counterQ++)
		{
			kmerListWanted.add(sc.next());
		}

		System.out.println(totalStringInput);

		for (int counterN = 0; counterN < (N - (k - 1)); counterN++)
		{
			String kmer = totalStringInput.substring(counterN, counterN + k);
			if (!kmerMapAll.containsKey(kmer)) kmerMapAll.put(kmer, 1);
			else kmerMapAll.put(kmer, kmerMapAll.get(kmer) + 1);
		}

		for (String kmerWanted : kmerListWanted)
		{
			System.out.println(kmerWanted + " " + kmerMapAll.get(kmerWanted));
		}

		sc.close();
		System.exit(0);
	}
}
