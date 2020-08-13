import java.util.*;

public class StringPalindrome
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuffer a=new StringBuffer(A);
        a.reverse();
        String aa=a.toString();
        if(aa.compareTo(A)==0)
        System.out.println("palindrome");
        else
        System.out.println("Not palindrome");
        sc.close();
    }
}