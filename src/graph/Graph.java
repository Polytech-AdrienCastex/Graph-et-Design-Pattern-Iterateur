
package graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author p1002239
 */
public class Graph implements IDirectedGraph
{
    public Graph()
    {
        arcs = new ArrayList<>();
        nodes = new ArrayList<>();
    }
    
    private List<Arc> arcs;
    private List<Node> nodes;

    @Override
    public boolean hasArc(Node _n1, Node _n2)
    {
        for(Arc a : arcs)
            if(a.getSource().getID() == _n1.getID() && a.getDestination().getID() == _n2.getID())
                return true;
        return false;
    }

    @Override
    public void addArc(Arc _edge)
    {
        arcs.add(_edge);
    }

    @Override
    public List<Arc> getArc(Node _n)
    {
        List<Arc> arcsNode = new ArrayList<>();
        
        arcs.stream().forEach((a) ->
        {
            if(a.getSource().getID() == _n.getID())
                arcsNode.add(a);
        });
        
        return arcsNode;
    }

    @Override
    public void addNode(Node _node)
    {
        nodes.add(_node);
    }

    @Override
    public Set<Node> getAllNodes()
    {
        Set<Node> allNodes = new HashSet<>();
        
        nodes.stream().forEach((n) -> { allNodes.add(n); });
        
        return allNodes;
    }

    @Override
    public int getNbNodes()
    {
        return nodes.size();
    }

    @Override
    public List<Node> getAdjNodes(Node _n)
    {
        List<Node> adjNodes = new ArrayList<>();
        
        arcs.stream().forEach((a) ->
        {
            if(a.getSource().getID() == _n.getID())
                adjNodes.add(a.getDestination());
        });
        
        return adjNodes;
    }

    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder();
        
        getAllNodes().stream().forEach((n) ->
        {
            str.append(":: noeud=");
            str.append(n.getLabel());
            str.append(" : [");
            
            getArc(n).stream().forEach((a) ->
            {
                str.append(a.getSource().getLabel());
                str.append(" ==> ");
                str.append(a.getDestination().getLabel());
                str.append("(");
                str.append(a.getValuation());
                str.append("), ");
            });
            if(!getArc(n).isEmpty())
                str.delete(str.length() - 2, str.length());
            str.append("]\r\n");
        });
        
        return str.toString();
    }

    @Override
    public Iterator<Node> iterator()
    {
        return new BFSIterator(this, nodes.get(0));
    }
    
    public Iterator<Node> iterator(Node startNode)
    {
        return new BFSIterator(this, startNode);
    }
}
