/*
 * Internal representation of data elements for both binary heap and sets
 * of Graph G(V,E)
 */
package dikjstra;

public class Node
{
	// elements of the graph added to the source vertex u
	protected int v; // neighbor
	protected int w; // weight/cost distance between (u,v)
	
	public Node (int neighbor, int weight) 
	{
		v = neighbor;
		w = weight;
	}
}