import java.util.Locale;

public class Stringdemo
{
    public static void main(String[] args)
    {

      String s = "Nancy"; //always contain null address
        s= s.concat(" Christian");
        s = s.toUpperCase();
        System.out.println(s.length());
        char x = s.charAt(2);
        System.out.println(x);
        //System.out.println(s.concat("Christian"));
        System.out.println(s);


    }

}
