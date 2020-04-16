
public class TruthTableMain {

	public static void main(String[] args) {
		
		System.out.print("-----------------------------------------------------------\n");
		System.out.print(" A | B || (A & B) | (A | B) | (A && B) | (A || B) | (A ^ B) ");
		System.out.print("\n-----------------------------------------------------------");
		
		boolean a = true;
		boolean b = true;
		
		TruthTable row1 = new TruthTable(a, b, (a & b), (a | b), (a && b), (a || b), (a ^ b));
		
		System.out.printf("\n%2s%2s%2s%3s%5s%5s%5s%5s%6s%5s%6s%5s%5s", toUpperChar(row1.getA()), "|", toUpperChar(row1.getB()), "||", toUpperChar(row1.getAAndB()), "|", toUpperChar(row1.getAOrB()), "|", toUpperChar(row1.getaAndAndB()), "|", toUpperChar(row1.getAOrOrB()), "|", toUpperChar(row1.aXOrB()));
		System.out.print("\n-----------------------------------------------------------");
		
		a = true;
		b = false;
		
		TruthTable row2 = new TruthTable(a, b, (a & b), (a | b), (a && b), (a || b), (a ^ b));
		
		System.out.printf("\n%2s%2s%2s%3s%5s%5s%5s%5s%6s%5s%6s%5s%5s", toUpperChar(row2.getA()), "|", toUpperChar(row2.getB()), "||", toUpperChar(row2.getAAndB()), "|", toUpperChar(row2.getAOrB()), "|", toUpperChar(row2.getaAndAndB()), "|", toUpperChar(row2.getAOrOrB()), "|", toUpperChar(row2.aXOrB()));
		System.out.print("\n-----------------------------------------------------------");
		
		a = false;
		b = true;
		
		TruthTable row3 = new TruthTable(a, b, (a & b), (a | b), (a && b), (a || b), (a ^ b));
		
		System.out.printf("\n%2s%2s%2s%3s%5s%5s%5s%5s%6s%5s%6s%5s%5s", toUpperChar(row3.getA()), "|", toUpperChar(row3.getB()), "||", toUpperChar(row3.getAAndB()), "|", toUpperChar(row3.getAOrB()), "|", toUpperChar(row3.getaAndAndB()), "|", toUpperChar(row3.getAOrOrB()), "|", toUpperChar(row3.aXOrB()));
		System.out.print("\n-----------------------------------------------------------");
		
		a = false;
		b = false;
		
		TruthTable row4 = new TruthTable(a, b, (a & b), (a | b), (a && b), (a || b), (a ^ b));
		
		System.out.printf("\n%2s%2s%2s%3s%5s%5s%5s%5s%6s%5s%6s%5s%5s", toUpperChar(row4.getA()), "|", toUpperChar(row4.getB()), "||", toUpperChar(row4.getAAndB()), "|", toUpperChar(row4.getAOrB()), "|", toUpperChar(row4.getaAndAndB()), "|", toUpperChar(row4.getAOrOrB()), "|", toUpperChar(row4.aXOrB()));
		System.out.print("\n-----------------------------------------------------------");
		
		
	}
	
	public static char toUpperChar(boolean x) {
		return Character.toUpperCase(Boolean.toString(x).charAt(0));
	}

}
