import java.util.Arrays;

public class StringReverse
{
    public static void main(String[] args) {
        String s = "racecar";
        char[] reverse = new char[s.length()];
        char[] chars = s.toCharArray();
        int lastIndex = chars.length - 1;


        for (int i = 0; i < chars.length - 1; i++) {
            reverse[lastIndex] = chars[i];
            lastIndex--;

        }
        //String reverseString = new String(reverse);
        //String.valueOf(reverseString);
        String s1 = String.valueOf(reverse);
       if (s.equals(s1))
       {
           System.out.println(" Its a Palindrome ");
       }
       else
       {
           System.out.println(" Its not a Palindrome");
       }
    }

}
