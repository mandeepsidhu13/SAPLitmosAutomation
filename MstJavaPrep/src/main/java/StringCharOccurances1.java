
public class StringCharOccurances1 {
    public static void main(String args[])
    {
        String s="Toronto";
        int tc=s.length();
        System.out.println("length is : "+tc);
        int tcn=s.replace("o", "").length();
        System.out.println("new length is : "+tcn);
        int c=tc-tcn;
        System.out.println("total count for 0 :"+c);
    }
    
}
