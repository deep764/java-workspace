package Module_2;
import java.util.ArrayList;
import java.util.List;
public class Interleaving 
{
	public static List<String> interleavings(String s1, String s2) 
	{
        List<String> result = new ArrayList<>();
        interleavings(s1, s2, "", result);
        return result;
    }
    
    private static void interleavings(String s1, String s2, String interleaved, List<String> result) {
        if (s1.isEmpty() && s2.isEmpty()) 
        {
            result.add(interleaved);
            return;
        }
        if (!s1.isEmpty()) 
        {
            interleavings(s1.substring(1), s2, interleaved + s1.charAt(0), result);
        }
        if (!s2.isEmpty()) 
        {
            interleavings(s1, s2.substring(1), interleaved + s2.charAt(0), result);
        }
    }
    
    public static void main(String[] args) 
    {
        String s1 = "WX";
        String s2 = "YZ";
        List<String> interleavings = interleavings(s1, s2);
        System.out.println(interleavings);
    }
}
