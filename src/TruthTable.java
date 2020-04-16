
public class TruthTable extends Object {
	
	private boolean a;
	private boolean b;
	private boolean aAndB;
	private boolean aOrB;
	private boolean aAndAndB;
	private boolean aOrOrB;
	private boolean aXOrB;

	public TruthTable(boolean a, boolean b, boolean aAndB, boolean aOrB, boolean aAndAndB, boolean aOrOrB, boolean aXOrB) {
		setA(a);
		setB(b);
		setAAndB(aAndB);
		setAOrB(aOrB);
		setAAndAndB(aAndAndB);
		setAOrOrB(aOrOrB);
		setAXOrB(aXOrB);
	
	}
	
	public TruthTable(boolean a, boolean b) {
		setA(a);
		setB(b);
		setAAndB(false);
		setAOrB(false);
		setAAndAndB(false);
		setAOrOrB(false);
		setAXOrB(false);
	}
	
	public boolean getA() {
		return a;
	}
	
	private void setA(boolean a) {
		this.a = a;
	}
	
	public boolean getB() {
		return b;
	}
	
	private void setB(boolean b) {
		this.b = b;
	}
	
	public boolean getAAndB() {
		return aAndB;
	}
	
	private void setAAndB(boolean aAndB) {
		this.aAndB = aAndB;
	}
	
	public boolean getAOrB() {
		return aOrB;
	}
	
	private void setAOrB(boolean aOrB) {
		this.aOrB = aOrB;
	}
	
	public boolean getaAndAndB() {
		return aAndAndB;
	}
	
	private void setAAndAndB(boolean aAndAndB) {
		this.aAndAndB = aAndAndB;
	}
	
	public boolean getAOrOrB() {
		return aOrOrB;
	}
	
	private void setAOrOrB(boolean aOrOrB) {
		this.aOrOrB = aOrOrB;
	}
	
	public boolean aXOrB() {
		return aXOrB;
	}
	
	private void setAXOrB(boolean aXOrB) {
		this.aXOrB = aXOrB;
	}
	
	@Override
	public String toString() {
		String temp = "";
		temp += "\nA: " + a;
		temp += "\nB: " + b;
		temp += "\nA&B: " + aAndB;
		temp += "\nA|B: " + aOrB;
		temp += "\nA&&B: " + aAndAndB;
		temp += "\nA||B: " + aOrOrB;
		temp += "\nA^B: " + aXOrB;
		return temp;
		
	}

}
