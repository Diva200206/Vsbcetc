import java.util.Scanner;
public class modify
{
    public static void main(String args[])
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int a=ip.nextInt();
        int []b=new int[a];
        int[]c=new int[a];
        int sum = 0;
        System.out.println("Enter the elements of array:");
        for(int i=0;i<a;i++)
        {
            b[i]=ip.nextInt();
        sum=sum+b[i];
        }
        int target =sum;
        for(int i=0;i<a;i++)
        {
            c[i]=target-b[i];
        }
        System.out.println("The modified array is:");
        for(int i=0;i<a;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}