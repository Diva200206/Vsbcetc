import java.util.Scanner;
public class bubble
{
    public static void main(String args[])
    {
        Scanner ip=new Scanner(System.in);
        int a=ip.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<a;i++)
        {
            arr[i]=ip.nextInt();
        }
        for(int i=0;i<a-1;i++)
        {
            for(int j=0;j<a-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted array is:");
        for(int i=0;i<a;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}