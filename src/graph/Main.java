package graph;

import java.util.AbstractList;
import java.util.Iterator;

public class Main
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException
        {
            Node n1 = new Node(new IntegerLabel(1));
            Node n2 = new Node(new IntegerLabel(2));
            Node n3 = new Node(new IntegerLabel(3));
            Node n4 = new Node(new StringLabel("A"));
            Node n5 = new Node(new StringLabel("B"));
            Node n6 = new Node(new StringLabel("C"));

            Arc a1 = new Arc(n1,n2, new DoubleLabel(0.1));
            Arc a1reversed = new Arc(n2,n1, new IntegerLabel(2));
            Arc a2 = new Arc(n2,n3, null);
            Arc a2reversed = new Arc(n3,n2, null);
            Arc a3 = new Arc(n1,n3, null);
            Arc a4 = new Arc(n3,n4, null);
            Arc a5 = new Arc(n4,n5, null);
            Arc a6 = new Arc(n2,n6, null);

            IDirectedGraph g = new Graph();
            g.addNode(n1);g.addNode(n2);g.addNode(n3);g.addNode(n4);g.addNode(n5);g.addNode(n6);
            g.addArc(a1);g.addArc(a1reversed);g.addArc(a2);g.addArc(a2reversed);g.addArc(a3);
            g.addArc(a4);g.addArc(a5);g.addArc(a6);
            /*System.out.println(g);
            System.out.println(g.hasArc(n1, n2)+" "+g.hasArc(n2, n4));
            System.out.println(g.getAdjNodes(n3));
            */
            
            System.out.println("********BFS***********");
            
            Iterator<Node> it = new BFSIterator(g, n1);
            while(it.hasNext())
                System.out.println(it.next());
            
            System.out.println("********DFS***********");
            
            Iterator<Node> itd = new DFSIterator(g, n1);
            while(itd.hasNext())
                System.out.println(itd.next());
	}

}
