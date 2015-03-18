
package graph;

import java.util.LinkedList;

/**
 *
 * @author p1002239
 */
public class BFSIterator extends GraphIterator<LinkedList<Node>>
{
    public BFSIterator(IGraph graph, Node startNode)
    {
        super(graph, startNode, new LinkedList<>());
    }

    @Override
    protected Node popNode()
    {
        return elements.poll();
    }
}
