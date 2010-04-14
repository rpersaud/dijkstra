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
	Vector<Integer> S;
	Vector<Integer> Graph;
	
	// Tracking variables
	private int maxEdges;
	private int maxVertices;
	
	/*
	 * Default Constructor
	 */
	public DjikstraAlgorithm(String file) 
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
			this.maxVertices = Integer.parseInt(primer.next());
			this.maxEdges = Integer.parseInt(primer.next());
			primer.close();
			
			// Declare size of graph
			Graph = new Vector<Integer>(this.maxVertices);
			
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	public static void main(String[] args)
	{
		// Input files to test
		String file1 = "C:\\Users\\Persaud\\Downloads\\1000.txt";
		String file2 = "C:\\Users\\Persaud\\Downloads\\25000.txt";
		
		// Instantiate instance of class
		DjikstraAlgorithm stub = new DjikstraAlgorithm(file1);
		
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