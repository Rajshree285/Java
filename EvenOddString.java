import java.util.*;

public class EvenOddString
{
	public static void main (String[] args){
	Scanner scan=new Scanner (System.in);
	String s=scan.nextLine();
	char[] c=s.toCharArray();
	for(int i=0;i<s.length();i+=2)
	{
		System.out.print(c[i]);
	}
	System.out.print(" ");
	for(int j=1;j<s.length();j+=2)
	{
		System.out.print(c[j]);
	}
	scan.close();
	}
}