
package graph;

import java.util.Stack;

/**
 *
 * @author p1002239
 */
public class DFSIterator extends GraphIterator
{
    public DFSIterator(IGraph graph, Node startNode)
    {
        super(graph, startNode, new Stack<>());
    }
}
