/**
 * @todo read and assign input variables from files in java
 * @todo translate c++ using array data structure - http://bit.ly/dejJL0 
 * Djikstra's Algorithm for single-source shortest paths
 * 
 * Input Format: 
 * Line1> n=vertices, m=edges (read once)
 * Line2> source vertex i (read n times)
 * Line3> neighbor j & weight of edge [i,j] (read m times)  
 * Line4> blank line (signals reading of next source vertex, update outer for loop)
 * 
 */
package dikjstra;

import java.io.*;
import java.util.Scanner;


public class DjikstraBinaryHeap {
	
	// Instance Variables

	private int vertices; // the number of vertices in the graph (n from file)
	private int edges; // the number of nonzero edges in the graph (m from file)
	private int[][] dist; // dist[i][j] is the distance between node i and j; or 0 if there is no direct connection
	//private Vector<Integer> dist = new Vector<Integer>();
	private long[] d; // d[i] is the length of the shortest path between the source (s) and node i
	
	/**
	 * Default constructor; Initialize and test stubs
	 */
	public DjikstraBinaryHeap(String file)
	{
		// Read the sample text file
		try {
			// Open the file to read
			FileInputStream fstream = new FileInputStream(file);
			
			// Get the object of the DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader (new InputStreamReader(in));
			
			// Read the initial two numbers from the first string atop each file
			Scanner primer = new Scanner(br.readLine()).useDelimiter("\\s*\\w+=");
			this.vertices = Integer.parseInt(primer.next());
			this.edges = Integer.parseInt(primer.next());
			primer.close();
				
			// Setup dist[i][j] matrix
		//	Vector<Integer> iVec = new Vector<Integer>(this.vertices);
			this.dist = new int[this.vertices][this.vertices];
			for (int i=0; i < this.vertices; i++) {
				for (int j=0; j < this.vertices; j++) {
					this.dist[i][j] = 0;
				}
				
			}
			
			// Read File Line by Line
			String strLine;
			int sourceVertex = 0;
			while ((strLine = br.readLine()) != null) {
				if (!strLine.isEmpty()) {
					String[] tokens = strLine.trim().split("[\\s]+");
					switch (tokens.length) {
					case 1:
						sourceVertex = Integer.parseInt(tokens[0]);
						break;
					case 2:
						this.dist[sourceVertex][Integer.parseInt(tokens[0])] = Integer.parseInt(tokens[1]);
						break;
						default:
							System.out.println("[Warning] Number of digits > 2");
					}
				}
			}
			
		} catch(Exception e) { // catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
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
	
	public int getMaxEdges() {
		return this.edges;
	}
	public int getMaxVertices() {
		return this.vertices;
	}
	
	public static void main (String[] args)
	{
		String file1 = "/Users/robert/Downloads/25000.txt";
		String file2 = "/Users/robert/Downloads/1000.txt";
		DjikstraBinaryHeap prog = new DjikstraBinaryHeap(file1);
	//	System.out.println("dist[0][176] == ? ..." + prog.dist[0][176]);
		
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
	public int MAX(int a, int b)
	{
		return ((a > b) ? (a) : (b));
	}
	
	public void printD()
	{
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
	
}