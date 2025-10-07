import java.util.Arrays;
public class MergeSortedArrays {
    public static int[] merge(int[] a, int[] b) {
        int[] r = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        
        while (i < a.length && j < b.length)
            r[k++] = (a[i] <= b[j]) ? a[i++] : b[j++];
        
        while (i < a.length) r[k++] = a[i++];
        while (j < b.length) r[k++] = b[j++];
        
        return r;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        
        System.out.println("Merged: " + Arrays.toString(merge(arr1, arr2)));
    }
}