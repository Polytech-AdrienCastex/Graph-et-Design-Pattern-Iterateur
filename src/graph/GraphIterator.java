
package graph;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author p1002239
 */
public abstract class GraphIterator<T extends AbstractCollection<Node>> implements Iterator<Node>
{
    protected GraphIterator(IGraph graph, Node startNode, T elements)
    {
        this.graph = graph;
        
        this.visitedNodes = new HashSet<>();
        this.elements = elements;
        
        elements.add(startNode);
    }
    
    private final IGraph graph;
    private final Set<Node> visitedNodes;
    protected final T elements;

    @Override
    public boolean hasNext()
    {
        return !elements.isEmpty();
    }
    
    protected abstract Node popNode();

    @Override
    public Node next()
    {
        Node current = popNode();
        visitedNodes.add(current);
        
        graph.getAdjNodes(current).stream()
                .filter(n -> !visitedNodes.contains(n))
                .forEach(n -> { elements.add(n); visitedNodes.add(n); });
                
        return current;
    }

    
}
