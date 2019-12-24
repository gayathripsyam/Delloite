package Exercise;

import java.util.StringTokenizer;

public class Token {
	
	public static void main(String[] args) {
		
	       String t = "The quick brown fox jumps over the lazy dog and killed it";
		   StringTokenizer tokenizer = new StringTokenizer(t);
		   System.out.println(tokenizer.countTokens());
		   
		   while(tokenizer.hasMoreTokens())
		   {
			   System.out.println(tokenizer.nextElement());
		   }
	}

}
