
public class StringPangram {

	public static void main(String args[])
	{
		String a ="The quick brown fox jumps over the lazy do";
int index=0;
int flag=0;
		boolean b[]= new boolean[26];
		
		for(int i=0;i<a.length();i++)
		{
			if('a'<=a.charAt(i))
			{
				index=a.charAt(i)-'a';
			}
			
			b[index]=true;
		}
		
		for(int i=0;i<b.length;i++)
		{
			if(b[i]== false)
			{
				flag=1;
			}
			
		}
		
		if(flag==1)
		{
			System.out.println("Not Pangram");
		}
		else
		{
			System.out.println("Pangram");
		}
		
	}
	
}
