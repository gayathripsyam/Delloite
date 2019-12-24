package Exercise;

import java.util.StringTokenizer; 

public class Exam {

	public static void main(String[] args) {
		
	String s = "The quick brown fox jumps over the lazy dog";
	char c = s.charAt(12);
    System.out.println(c);
    
    String search = "is";
    if(s.toLowerCase().contains(search.toLowerCase())) {
    System.out.println("Is is found");
    }
    System.out.println("Is is not found");
     
    String snew = " and killed it";
    String s1=s.concat(snew);
    System.out.println(s1);
    
    String s2 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
    if(s.equals(s2)) {
    System.out.println("Matches");
    	}
    System.out.println("Doesn't match");
    
    System.out.println(s.length());
    
    String s3 = "The quick brown Fox jumps over the lazy Dog";
    if(s.equals(s3)) {
    	System.out.println("Matches");
    }
    System.out.println("Doesn't match");
    
    String replaceString=s.replaceAll("the","A");
    System.out.println(replaceString);

    
  


//names alone
	String [] s5 = s.split(" j");
	s5[1] = "j" + s5[1];
	for(String s6 : s5) {
		System.out.println(s6);
	}

	//for (String k : s5)
    //System.out.println(k);
    
    System.out.println(s.toLowerCase() );
    
    System.out.println(s.toUpperCase() );
    
    System.out.println("Index of a in string: "+s.indexOf('a'));
    
    System.out.println("Last Index of e in string: " +s.lastIndexOf('e')); 

    
}
}