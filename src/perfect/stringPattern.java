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
	
	// p.32
	// it might be ineffective concat.
	static String concat(String[] array) {
		String result = "";
		for(String s: array) {
			result += s; // This line create StringBuilder object and call append function twice in each loop. 
		}
		return result;
	}
}
