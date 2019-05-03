import java.util.HashMap;


public class LongestSubstringWithKDistinctCharacter {

	public static void main(String args[])
	{
		
		int start=0;
		int end=0;
		int window_size=end-start+1;
		
		String a="karappa";
		String longest_substring=a.substring(start, end);
		char b[]=a.toCharArray();
		
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		
		for(int i=0;i<b.length;i++)
		{
			if(!map.containsKey(b[i]))
			{
				map.put(b[i], 1);
			}
			else
			{
				map.put(b[i], (map.get(b[i])+1));
			}
		}
		
	}
	
	
}
