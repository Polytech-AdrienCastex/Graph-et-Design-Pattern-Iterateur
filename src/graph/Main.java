package graph;

public class Main
{
	public static void main(String[] args)
        {
            Node n1 = new Node(new IntegerLabel(1));
            Node n2 = new Node(new IntegerLabel(2));
            Node n3 = new Node(new IntegerLabel(3));
            Node n4 = new Node(new StringLabel("A"));

            Arc a1 = new Arc(n1,n2, new DoubleLabel(0.1));
            Arc a1reversed = new Arc(n2,n1, new IntegerLabel(2));
            Arc a2 = new Arc(n2,n3, null);
            Arc a2reversed = new Arc(n3,n2, null);
            Arc a3 = new Arc(n1,n3, null);

            IDirectedGraph g = new Graph();
            g.addNode(n1);g.addNode(n2);g.addNode(n3);g.addNode(n4);
            g.addArc(a1);g.addArc(a1reversed);g.addArc(a2);g.addArc(a2reversed);g.addArc(a3);
            /*System.out.println(g);
            System.out.println(g.hasArc(n1, n2)+" "+g.hasArc(n2, n4));
            System.out.println(g.getAdjNodes(n3));
            */
            for(Node n : g)
                System.out.println(n.getLabel());
	}

}
