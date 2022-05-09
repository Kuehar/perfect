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
	
	// p.32
	// it is improved concat.
	// String is immutable object and you mainly uses immutable object when you'd like to focus on robust programming.
	// If you will use forloop to concat string, you should use stringbuilder class 
	static String improvedConcat(String[] array) {
		StringBuilder result = new StringBuilder();
		for(String s: array) {
			result.append(s);
		}
		return result.toString();
	}
}
