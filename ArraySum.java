import java.util.Scanner;
public class ArraySum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[] = new int[n];
        int sum=0,i;
        for(i=1;i<=n;i++)
        {
            a[i]=sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("The sum of the elements is "+sum);
    }
}