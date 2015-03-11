package graph;

public class IntegerLabel implements Label {
	int label;

	public IntegerLabel(int label) {
		super();
		this.label = label;
	}

	public Object getLabel() {
		return label;
	}

	public void setLabel(Object label) {
		this.label = (Integer) label;
	}
	
	public String toString(){
		return String.valueOf(label) ;
	}
	
}
