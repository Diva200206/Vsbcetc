import java.util.Scanner;
public class frequency
{
    public static void main(String args[])
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int a=ip.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the elements of array:");
        for(int i=0;i<a;i++)
        {
            arr[i]=ip.nextInt();
        }
        System.out.println("Enter the element to find frequency:");
        int key=ip.nextInt();
        int count=0;
        for(int i=0;i<a;i++)
        {
            if(arr[i]==key)
            {
                count++;
            }
        }
        System.out.println("The frequency of element "+key+" is: "+count);
    }
}