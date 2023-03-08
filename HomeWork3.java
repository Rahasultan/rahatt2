//Concatenate two arrays to new array
import java.util.Arrays;
public class HomeWork3 {
    static int [] merge(int[] A,int[] B,int[] C)
    {
        int i=0,j=0,k=0;
        while (i<A.length&&j<B.length)
        {
            if(A[i]<=B[j])
            {
                C[k]=A[i];
                i++;
            }
            else
            {
                C[k]=B[j];
                j++;
            }
            k++;
        }
        while (i<A.length)
        {
            C[k]=A[i];
            i++;
            k++;
        }
        while(j<B.length)
        {
            C[k]=B[j];
            j++;
            k++;
        }
        return C;
    }
    public static void main(String[] args) {
        int[] a={2,4,6,9};
        int[] b={1,3,5,7,8};
        int[] c=new int[a.length+b.length];

        System.out.println(Arrays.toString(merge(a,b,c)));
    }
}
