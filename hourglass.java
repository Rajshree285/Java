import java.util.*;

class hourglass{
public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int a[][]=new int [6][6];
	for(int i=0;i<3;i++)
	{
	for(int j=0;j<3;j++)
	{
		a[i][j]=sc.nextInt();
	}
	}
	sc.close();
	int max=-63,t=0;
	for(int i=0;i<4;i++)
	{
		for(int j=0;j<4;j++)
		{
			t=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
			if(t>=max)
			max=t;
		}
	}
	System.out.println(max);
}
}