
package graph;

import java.util.ArrayList;

/**
 *
 * @author p1002239
 */
public class BFSIterator extends GraphIterator
{
    public BFSIterator(IGraph graph, Node startNode)
    {
        super(graph, startNode, new ArrayList<>());
    }
}
