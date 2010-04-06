/**
 * Djikstra's Algorithm for single-source shortest paths
 * @todo read and assign input variables from files in java
 * @todo translate c++ using array data structure - http://bit.ly/dejJL0 
 */
package dikjstra;

import java.io.*;
import java.util.*;

public class DjikstraBinaryHeap {
	
	// Instance Variables
	
	public static final int GRAPHSIZE = 2048;
	public static final int INFINITY = GRAPHSIZE*GRAPHSIZE;
	// public static final int MAX(a, b) = ((a > b) ? (a) : (b));

	private int e; // The number of nonzero edges in the graph 
	private int n; // The number of nodes in the graph
	private int[][] dist = new int[GRAPHSIZE][GRAPHSIZE]; // dist[i][j] is the distance between node i and j; or 0 if there is no direct connection
	private long[] d = new long[GRAPHSIZE]; // d[i] is the length of the shortest path between the source (s) and node i
	
	
	/**
	 * Default constructor; Initialize and test stubs
	 */
	public DjikstraBinaryHeap()
	{
		
	}
	
	public void dijkstra(int s)
	{
		/*
		int i, k, mini;
		int visited[GRAPHSIZE];

		for (i = 1; i <= n; ++i) {
			d[i] = INFINITY;
			visited[i] = 0; // the i-th element has not yet been visited 
		}

		d[s] = 0;

		for (k = 1; k <= n; ++k) {
			mini = -1;
			for (i = 1; i <= n; ++i)
				if (!visited[i] && ((mini == -1) || (d[i] < d[mini])))
					mini = i;

			visited[mini] = 1;

			for (i = 1; i <= n; ++i)
				if (dist[mini][i])
					if (d[mini] + dist[mini][i] < d[i])
						d[i] = d[mini] + dist[mini][i];
		}
		*/
	}
	
	
	public static void  main(String args)
	{
	/*
	int i, j;
	int u, v, w;

	FILE *fin = fopen("dist.txt", "r");
	fscanf(fin, "%d", &e);
	for (i = 0; i < e; ++i)
		for (j = 0; j < e; ++j)
			dist[i][j] = 0;
	n = -1;
	for (i = 0; i < e; ++i) {
		fscanf(fin, "%d%d%d", &u, &v, &w);
		dist[u][v] = w;
		n = MAX(u, MAX(v, n));
	}
	fclose(fin);

	dijkstra(1);

	printD();

	return 0;
	*/
	}
	
	/**
	 * Returns the longest path between the vertices (a,b)
	 * @param a vertex
	 * @param b vertex
	 * @return integer of shortest path
	 */
	public int MAX(int a, int b) {
		return ((a > b) ? (a) : (b));
	}
	
	public void printD() {
		/*
		int i;
		for (i = 1; i <= n; ++i)
			printf("%10d", i);
		printf("\n");
		for (i = 1; i <= n; ++i) {
			printf("%10ld", d[i]);
		}
		printf("\n");
		*/
	}
	
	public void readFile() {
		
	}
}