
public class Stringg
{
    public static void main(String[] args)
    {
    	String s=new String("String");
    	s.replace('t', 'a');
    	System.out.println(s);
    	System.out.println(s.hashCode());
    	StringBuffer ss=new StringBuffer("StringBuffer");
    	ss.replace(1, 2, "a");
    	System.out.println(ss);
    	System.out.println(ss.hashCode());
    	StringBuilder sb=new StringBuilder("StringBuilder");
    	sb.replace(0, 3, "abc");
    	System.out.println(sb);
    	System.out.println(sb.hashCode());
    }
}
