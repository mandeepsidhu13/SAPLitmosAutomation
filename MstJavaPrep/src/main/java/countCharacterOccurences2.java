import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class countCharacterOccurences2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string");
        String a=sc.nextLine();
        a=a.replace(" ", "");
        char[] str=a.toCharArray();
        
        Map<Character,Integer> charMapCount=new HashMap<>();
        
        for(Character c:str)
        {
            if(charMapCount.containsKey(c))
            {
                charMapCount.put(c, charMapCount.get(c)+1);
            }
            else
            {
                  charMapCount.put(c, 1);
            }
        }
        
         System.out.println(charMapCount);
        
        
        
    }
}
