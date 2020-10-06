import java.util.Scanner;

public class swapWithoutTemp {
    public static void main(String[] args) {
        System.out.print("Enter 2 numbers to swap:");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        a+=b;
        b=a-b;
        a=a-b;
        System.out.print("Numbers after swapping are:");
        System.out.print(a +" "+b);
        sc.close();
    }
}