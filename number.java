import java.util.*;
public class number
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
     a[i]=sc.nextInt(); 
    }
    for(int j=0;j<k;j++)
    {
        int max=0;
      for(int i=0;i<n;i++)
      {
       if(a[i]>max)
         max=a[i];
      }
      for(int i=0;i<n;i++)
      {
        if(a[i]==max)
          a[i]=a[i]/2;
      }
    }
    int sum=0;
    for (int i = 0; i < n; i++)
    {
       sum+=a[i];
    }
     System.out.print(sum); 
     sc.close();
  }
}