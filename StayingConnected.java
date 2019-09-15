package placementStudy;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class StayingConnected
{
	public static void main(String[] args)
	{
		String data = "5\r\n" + "4\r\n" + "0 1\r\n" + "0 2\r\n" + "1 2\r\n" + "3 4";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Scanner sc = new Scanner(System.in);
		int numberVertices = sc.nextInt();
		int numberEdges = sc.nextInt();
		TreeMap<Integer, Boolean> vertexVisitedMap = new TreeMap<Integer, Boolean>();
		TreeMap<Integer, ArrayList<Integer>> graphEdges = new TreeMap<Integer, ArrayList<Integer>>();
		Boolean allVerticesVisited = false;
		int numberConnectedGraphs = 0;

		for (int i = 0; i < numberVertices; i++)
		{
			vertexVisitedMap.put(i, false);
			graphEdges.put(i, new ArrayList<Integer>());
		}

		while (sc.hasNextInt())
		{
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			graphEdges.get(v1).add(v2);
			if (!graphEdges.get(v2).contains(v1)) graphEdges.get(v2).add(v1);
		}

		while (!allVerticesVisited)
		{
			for (int i = 0; i < numberVertices; i++)
			{
				if (!vertexVisitedMap.get(i))
				{
					int vertexUnvisited = i;
					dfs(graphEdges, vertexUnvisited, vertexVisitedMap);
					numberConnectedGraphs++;
				}
			}
			allVerticesVisited = checkAllVerticesVisited(vertexVisitedMap);
		}
		System.out.println(numberConnectedGraphs);

	}

	public static void dfs(TreeMap<Integer, ArrayList<Integer>> graphEdges, int rootVertex,
			TreeMap<Integer, Boolean> vertexVisitedMap)
	{
		vertexVisitedMap.put(rootVertex, true);
		ArrayList<Integer> connectedVertices = graphEdges.get(rootVertex);

		for (int connectedVertex : connectedVertices)
		{
			if (!vertexVisitedMap.get(connectedVertex))
			{
				dfs(graphEdges, connectedVertex, vertexVisitedMap);
			}
		}
	}

	public static boolean checkAllVerticesVisited(TreeMap<Integer, Boolean> vertexVisitedMap)
	{
		for (int i = 0; i < vertexVisitedMap.size(); i++)
		{
			if (!vertexVisitedMap.get(i)) return false;
		}
		return true;
	}

}
