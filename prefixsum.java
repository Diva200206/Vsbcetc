import java.util.*;
public class prefixsum{
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int a=ip.nextInt();
        int[]b=new int [a];
        int[]c=new int [a];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<a;i++)
        {
            b[i]=ip.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if(i==0)
            {
                c[i]=b[i];
            }
            else if(i>0)
            {
                c[i]=c[i-1]+b[i];
            }
        }
        String res=Arrays .toString(c);
        System.out.print("The prefix sum of the array is:");
        System.out.println(res);
    }
}