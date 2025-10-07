import java.util.Scanner;
public class binary
{
    public static void main(String args[])
    {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int a=ip.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the elements of array in sorted order:");
        for(int i=0;i<a;i++)
        {
            arr[i]=ip.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        boolean found=false;
        int key,pos;
        key=ip.nextInt();
        int low=0,high=a-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                found=true;
                pos=mid;
                System.out.println("The element found at position "+pos);
                break;
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        if(found==false)
        {
            System.out.println("The element not found");
        }
    }
}