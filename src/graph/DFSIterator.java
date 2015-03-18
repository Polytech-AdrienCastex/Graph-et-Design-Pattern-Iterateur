
package graph;

import java.util.Stack;

/**
 *
 * @author p1002239
 */
public class DFSIterator extends GraphIterator<Stack<Node>>
{
    public DFSIterator(IGraph graph, Node startNode)
    {
        super(graph, startNode, new Stack<>());
    }

    @Override
    protected Node popNode()
    {
        return elements.pop();
    }
}
