/**
 * Robert Persaud
 * Computer Science, Georgia State University
 * Dr. Zelikovsky, Fall 2010
 * Djikstra single-source-shortest-path algorithm using Binary Heap
 * 
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
public class DjikstraAlgorithm
{
	BinaryMinHeap Q; // Min Priority Queue used to sustain invariant V-G
	Vector S; // Set of vertices where final shortest weights from the source s have been determined
	Vector [] Adj; // Adjacency List for Graph G(V,E)
	
	// Tracking variables
	private int n; // total number of vertices in file
	private int m; // total number of edges in file
	private int s; // source vertex to run algorithm from
	
	/*
	 * Default Constructor
	 */
	public DjikstraAlgorithm(String inputFile, int sourceVertex) 
	{	
		// Read the sample text file
		try {
			// Open the file to read
			FileInputStream fstream = new FileInputStream(inputFile);
			
			// Get the object of the DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader (new InputStreamReader(in));
			
			// Read the initial two numbers from the first string atop each file
			Scanner primer = new Scanner(br.readLine()).useDelimiter("\\s*\\w+=");
			n = Integer.parseInt(primer.next());
			m = Integer.parseInt(primer.next());
			primer.close();
			
			// Create our adjacency list of |V| length
			Adj = new Vector[n];
			
			// Set source vertex
			s = sourceVertex; 
			
			// Initialize adjacency list
			for (int i=0; i < Adj.length; i++) {
				Adj[i] = new Vector();
			}
			
			// Populate Adjacency List with vertex, edge data
			String strLine;
			int u = 0;
			int v = 0;
			int w = 0;
			while ((strLine = br.readLine()) != null) {
				if (!strLine.isEmpty()) {
					String[] tokens = strLine.trim().split("[\\s]+");
					switch (tokens.length) {
					case 1: // lines with only 1 digit
						u = Integer.parseInt(tokens[0]);
						Adj[u] = new Vector();//adjList[sourceVertex] = new Vector();
						break;
					case 2: // lines with 2 digits seperated by a space
						v = Integer.parseInt(tokens[0]);
						w = Integer.parseInt(tokens[1]);
						Adj[u].add(new Node(v,w));
						break;
					default: // lines that are either blank
						System.out.println("[Warning] Number of digits > 2");
					}
				}
			}
			
			System.out.println("|V| = " + n + ", |E| = " + m); // debug

			System.out.println("Size of adjacency list = " + Adj.length);
			
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	/*
	 * initialize-single-source(G,s) // performed within default constructor
	 * S <- 0 // set of vertices
	 * Q <- V[G] // min-priority queue
	 * while Q != 0 (min binary heap is not empty)
	 * 	do u <- extract-min(Q)
	 * 		S <- S or [u]
	 * 		for each vertex v e Adj[u]  // need to create adjacency list
	 * 			do Relax(u,v,w)
	 */
	public static void main(String[] args)
	{
		// Input files to test
		String file1 = "C:\\Users\\Persaud\\Downloads\\1000.txt"; // win
		//String file1 = "/Users/robert/Downloads/1000.txt"; // mac
		String file2 = "C:\\Users\\Persaud\\Downloads\\25000.txt"; //win
		//String file2 = "/Users/robert/Downloads/25000.txt"; // mac
		
		// initialize single-source G, s
		DjikstraAlgorithm stub = new DjikstraAlgorithm(file1, 0);
		
		stub.S = null;
		
		stub.Q = new BinaryHeap();
		
		
	}	
}