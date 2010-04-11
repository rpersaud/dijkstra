/**
 * Robert Persaud
 * Computer Science, Georgia State University
 * Dr. Zelikovsky, Fall 2010
 * Djikstra single-source-shortest-path algorithm using Binary Heap
 */
package dikjstra;

/**
 * @author RPersaud
 *
 */
public class DjikstraAlgorithm {

	// Graph<V,E> G; Perhaps incidence list
	// BinaryMinHeap Q;
	// Vector<int> S;
	
	/*
	 * Default Constructor
	 */
	public DjikstraAlgorithm() 
	{
	
	}
	
	public static void main(String[] args)
	{
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
}