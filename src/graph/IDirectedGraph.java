package graph;

import java.util.List;
import java.util.Set;

public interface IDirectedGraph extends IGraph{
	/**
	 * 
	 * @param _n1
	 * @param _n2
	 * @return vrai si le graph possede un arc de source _n1 et de destination _n2
	 */
	public boolean hasArc(Node _n1, Node _n2);

	/**
	 * Ajoute un arc au graph
	 * @param _edge
	 */
	public void addArc(Arc _edge);

	/**
	 * 
	 * @param _n
	 * @return tous les arcs du graph ayant pour source le noeud _n
	 */
	public List<Arc> getArc(Node _n);
	
}
