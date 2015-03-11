/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graph;

import java.util.List;

/**
 *
 * @author p1002239
 */
public class UGraph extends Graph implements IUndirectedGraph
{

    @Override
    public void addEdge(Node _node1, Node _node2)
    {
        addArc(new Arc(_node1, _node2, null));
        addArc(new Arc(_node2, _node1, null));
    }

    @Override
    public boolean hasEdge(Node _node1, Node _node2)
    {
        return getAdjNodes(_node1).stream().anyMatch(n -> n.getID() == _node2.getID());
    }
}
