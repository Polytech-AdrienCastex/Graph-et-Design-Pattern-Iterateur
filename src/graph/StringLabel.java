package graph;

public class StringLabel  implements Label {
	String label;

	public StringLabel(String label) {
		super();
		this.label = label;
	}

	public Object getLabel() {
		return label;
	}

	public void setLabel(Object label) {
		this.label = (String) label;
	}
	
	public String toString(){
		return label ;
	}

}
