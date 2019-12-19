
public class StringBuilderDemo_01 {

	public static void main(String[] args) {
		
		StringBuilder Sb=new StringBuilder();
		System.out.println(Sb.capacity());
		
		Sb.append("prasanth");
		System.out.println(Sb.toString());
		System.out.println(Sb.reverse());
		System.out.println();
		
		StringBuilder sb= new StringBuilder(20);
		
		System.out.println(sb.capacity());
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Prasanth");
		System.out.println(sb1.codePointAt(3));
		System.out.println(sb1.delete(0, 1));
		System.out.println(sb1.subSequence(0, 2));
		sb1.setLength(4);
		System.out.println(sb1.toString());

	}

}
