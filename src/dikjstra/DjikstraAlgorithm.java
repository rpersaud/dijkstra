/**
 * Robert Persaud
 * Computer Science, Georgia State University
 * Dr. Zelikovsky, Fall 2010
 * Djikstra single-source-shortest-path algorithm using Binary Heap
 */
package dikjstra;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author RPersaud
 *
 */
public class DjikstraAlgorithm {

	// Graph<V,E> G; Incidence list
	BinaryHeap Q;
	Vector S; // set of vertices where final shortest weights from the source s have been determined
	Graph G;
	
	// Tracking variables
//	private int maxEdges;
	//private int maxVertices;
	
	/*
	 * Default Constructor
	 */
	public DjikstraAlgorithm(String file) 
	{
		int noV, noE = 0; // number of vertices and edges place holders
		
		// Read the sample text file
		try {
			// Open the file to read
			FileInputStream fstream = new FileInputStream(file);
			
			// Get the object of the DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader (new InputStreamReader(in));
			
			// Read the initial two numbers from the first string atop each file
			Scanner primer = new Scanner(br.readLine()).useDelimiter("\\s*\\w+=");
			noV = Integer.parseInt(primer.next());
			noE = Integer.parseInt(primer.next());
			primer.close();
			G = new Graph(noV, noE);
				
			System.out.println("|V| = " + G.getV() + ", |E| = " + G.getE()); // debug
			
			// Initialize Adjacency List
			// Fill Adjacency List
			// Read File Line by Line
			String strLine;
			int sourceVertex = 0;
			int neighbor, weight = 0;
			
			while ((strLine = br.readLine()) != null) {
				if (!strLine.isEmpty()) {
					String[] tokens = strLine.trim().split("[\\s]+");
					switch (tokens.length) {
					case 1:
						sourceVertex = Integer.parseInt(tokens[0]);
						G.adjList[sourceVertex] = new Vector();//adjList[sourceVertex] = new Vector();
						break;
					case 2:
						neighbor = Integer.parseInt(tokens[0]);
						weight = Integer.parseInt(tokens[1]);
						G.adjList[sourceVertex].addNode(sourceVertex, neighbor, weight)//;(Integer.parseInt(tokens[1])); // = Integer.parseInt(tokens[1]);
						break;
						default:
							System.out.println("[Warning] Number of digits > 2");
					}
				}
			}
			
			System.out.println("Size of adjacency list = " + G.adjList.length);
			
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	public static void main(String[] args)
	{
		// Input files to test
		String file1 = "C:\\Users\\Persaud\\Downloads\\1000.txt"; // win
		//String file1 = "/Users/robert/Downloads/1000.txt"; // mac
		String file2 = "C:\\Users\\Persaud\\Downloads\\25000.txt"; //win
		//String file2 = "/Users/robert/Downloads/25000.txt"; // mac
		// Instantiate instance of class
		DjikstraAlgorithm stub = new DjikstraAlgorithm(file2);
		
		// u, v, w = all ints
		
		/*
		 * initialize-single-source(G,s)
		 * S <- 0 // set of vertices
		 * Q <- V[G] // min-priority queue
		 * while Q != 0 (min binary heap is not empty)
		 * 	do u <- extract-min(Q)
		 * 		S <- S or [u]
		 * 		for each vertex v e Adj[u]
		 * 			do Relax(u,v,w)
		 */
	}
	
	public void initSingleSource(String G, int s)
	{
		// assign d[v] to infinity 
	}
}