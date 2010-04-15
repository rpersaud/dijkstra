/*
 * Elements of a Graph G(V,E) stored within an adjacency list
 * 
 * @author Robert Persaud
 */
package dikjstra;

import java.util.Vector;

public class Graph
{
	public class Node
	{
		// elements of the graph added to the source vertex u
		protected int neighbor; // @see denoted v in text book
		protected int weight; // @see denoted w in text book
	}

	Vector [] adjList;
	private int maxVertices;
	private int maxEdges;
	
	public Graph(int V, int E) 
	{
		maxVertices = V;
		maxEdges = E;
		adjList = new Vector[V];
	}
	
	public void addNode(int u, Node v) 
	{
		adjList[u].add(v);
		// adjList[v].add(u); // want to show cross-relation
	}
	
	public void removeNode(int u, int vIndex)
	{
		adjList[u].removeElementAt(vIndex);
	}
}