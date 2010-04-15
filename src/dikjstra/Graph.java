/*
 * Elements of a Graph G(V,E) stored within an adjacency list
 * 
 * @author Robert Persaud
 * GSU, Spring 2010 - csc 6520 Algorithms
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
		
		public Node (int v, int w) 
		{
			neighbor = v;
			weight = w;
		}
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
	
	public void addNode(int u, int v, int w) 
	{
		adjList[u].add(new Node(v, w));
		// adjList[v].add(u); // wan)t to show cross-relation
	}
	public Node getNode(int u, int vIndex)
	{
		return (Node) adjList[u].get(vIndex);
	}
	public void removeNode(int u, int vIndex)
	{
		adjList[u].removeElementAt(vIndex);
	}
	
	public int getV()
	{
		return maxVertices;
	}
	public int getE()
	{
		return maxEdges;
	}
}