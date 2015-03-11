package graph;

public class DoubleLabel  implements Label {
	double label;

	public DoubleLabel(double label) {
		super();
		this.label = label;
	}

	public Object getLabel() {
		return label;
	}

	public void setLabel(Object label) {
		this.label = (Double) label;
	}
	public String toString(){
		return Double.toString(label) ;
	}
}
