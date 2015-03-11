
package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author p1002239
 */
public abstract class GraphIterator implements Iterator<Node>
{
    protected GraphIterator(IGraph graph, Node startNode, List<Node> elements)
    {
        this.graph = graph;
        
        visitedNodes = new HashSet<>();
        this.elements = elements;
        elements.add(startNode);
    }
    
    private IGraph graph;
    private Set<Node> visitedNodes;
    private List<Node> elements;

    @Override
    public boolean hasNext()
    {
        return !elements.isEmpty();
    }

    @Override
    public Node next()
    {
        Node current = elements.get(0);
        elements.remove(0);
        visitedNodes.add(current);
        
        graph.getAdjNodes(current).stream()
                .filter(n -> !visitedNodes.contains(n))
                .forEach(n -> elements.add(n));
                
        return current;
    }

    
}
