package graph;

/**
 * Classe representant un noeud etiquete pour un graph
 * 
 *
 */

public class Node {
	/**
	 * etiquette du noeud
	 */
    private Label label;
    /**
     * ID unique du noeud
     */
    private int uniqueID;
    /**
     * nombre total d'instances de Noeud
     */
    private static int nombreOfNoeud = 0;
    
    /**
     * Construit un noeud avec une etiquette
     * @param _label etiquette du noeud
     */
    public Node(Label _label){
    	this.label = _label;
    	this.uniqueID = nombreOfNoeud;
    	Node.nombreOfNoeud ++;
    }
    
    /**
     * 
     * @return l'unique ID du noeud
     */
    public int getID() { return uniqueID ;} 
    /**
     * Specifie l etiquette du noeud
     * @param _label
     */
    public void setLabel(Label _label) { this.label = _label; }
    /**
     * 
     * @return  l etiquette du noeud
     */
    public Label getLabel() { return label; }

    
    
	@Override
	public String toString() {
		return ""+label;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (uniqueID != other.uniqueID)
			return false;
		return true;
	}

    
   
}


