import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int a=A.length();
        int b=B.length();
        System.out.println(a+b);
        int s=A.compareTo(B);
        if (s>1)
        System.out.println("Yes");
        else
        System.out.println("No");
        char s1[]=A.toCharArray();
        char s2[]=B.toCharArray();
        System.out.print((A.substring(0,1)).toUpperCase()+A.substring(1));
        System.out.print(" ");
        System.out.print((B.substring(0,1)).toUpperCase()+B.substring(1));
    }
}