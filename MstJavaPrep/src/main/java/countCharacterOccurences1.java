import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class countCharacterOccurences1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String s = sc.nextLine();
        char[] abc = s.toCharArray();
        Map<Character,Integer> charMapCount = new HashMap<>();
        for (int i = 0; i < abc.length; i++) {
            if (charMapCount.containsKey(abc[i])) {
                charMapCount.put(abc[i], charMapCount.get(abc[i]) + 1);
            } else {
                charMapCount.put(abc[i], 1);
            }
        }
        System.out.println(charMapCount);
    }
}
