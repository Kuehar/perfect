package perfect;

public class stringPattern {
	public static void main(String[] args) {
		// p.30
		// String -> StringBuilder
		String s = "abc";
		StringBuilder sb = new StringBuilder(s);
		
		// StringBuilder -> String
		StringBuilder sb2 = new StringBuilder("abc");
		String s2 = sb2.toString();
	}
}
