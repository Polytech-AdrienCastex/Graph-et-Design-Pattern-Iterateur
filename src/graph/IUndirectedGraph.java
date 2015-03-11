package graph;

import java.util.List;
import java.util.Set;

public interface IUndirectedGraph extends IGraph{

	/**
	 * Ajoute une arrete au graph entre deux noeuds
	 * 
	 */
	public void addEdge(Node _node1,Node _node2);
	/**
	 *  @return vrai si le graph possede une arrete entre les noeuds _n1 et _n2
	 * 
	 */
	public boolean hasEdge(Node _node1,Node _node2);


}
