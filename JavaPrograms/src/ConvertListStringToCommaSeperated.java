import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ConvertListStringToCommaSeperated {

	
	public static void main(String args[])
	{
		ArrayList<String> cities = new ArrayList<String>(); 
               cities.add("London"); 
                cities.add("New York"); 
String citiesCommaSeparated = String.join(",", cities);
System.out.println(citiesCommaSeparated);
	}
}
