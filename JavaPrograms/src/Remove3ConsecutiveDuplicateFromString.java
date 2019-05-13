import java.util.Vector;


public class Remove3ConsecutiveDuplicateFromString {
	static void remove3ConsecutiveDuplicates(String str) 
	{ 
	    Vector<Character> v = new Vector<>(); 
	    for (int i = 0; i < str.length(); ++i)  
	    { 
	        v.add(str.charAt(i)); 
	  
	        if (v.size() > 2)  
	        { 
	            int sz = v.size(); 
	  
	            // removing three consecutive duplicates 
	            if (v.get(sz - 1) == v.get(sz - 2) &&  
	                v.get(sz - 2) == v.get(sz - 3))  
	            { 
	                v.setSize(sz - 3); // Removing three characters 
	                                // from the string 
	            	
	             //   v.remov
	            } 
	        } 
	    } 
	  
	    // printing the string final string 
	    for (int i = 0; i < v.size(); ++i) 
	        System.out.print(v.get(i)); 
	} 
	  
	// Driver code 
	public static void main(String[] args)  
	{ 
	    String str = "aabbbaccddddc"; 
	    remove3ConsecutiveDuplicates(str); 
	} 
}
