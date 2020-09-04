import java.util.*;

/**
 * SumOfNnaturalNum
 */
public class SumOfNnaturalNum {
public static void main(String[] args) {
  
   Scanner sc=new Scanner(System.in);
   int no=sc.nextInt();
   System.out.println("using recursion"+" "+sum1(no));
   System.out.print("without using recursion"+" "+sum2(no));
   sc.close();
}
   static int sum1 (int n)
   {
      if(n==0)
      return 0;
      else
      return n+sum1(n-1);
   }
static int sum2(int n)
{
   return n*(n+1)/2;
}
}