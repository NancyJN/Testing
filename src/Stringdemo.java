import java.util.Arrays;
import java.util.Locale;

public class Stringdemo
{
    public static void main(String[] args)
    {

      String s = "Nancy"; //always contain null address
        boolean ic = s.contains("an");
        System.out.println(ic);

        char[] chars = s.toCharArray();

        for (int i =0; i < chars.length ;i++)
        {
            System.out.println(chars[i]);
        }
        System.out.println(Arrays.toString(chars));

        s= s.concat(" Christian");
        s = s.toUpperCase();
        System.out.println(s.length());
        char x = s.charAt(2);
        String s1 = String.valueOf(x);
        String s2 = String.valueOf(x);
        System.out.println(x);
        //System.out.println(s.concat("Christian"));
        System.out.println(s);


    }

}
