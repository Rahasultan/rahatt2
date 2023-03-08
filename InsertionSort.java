import java.util.Arrays;
public class InsertionSort {
    public static void  Sort(int[]data){
        int j,v;
        for (int i=1;i<data.length;i++){
            j=i;
            v=data[i];
            while ((j>0)&&(data[j-1]>v)){
                data[j]=data[j-1];
                j--;
            }
            data[j]=v;
        }
    }

    public static void main(String[] args) {
        int[] a={3,6,4,1,2,5};
        Sort(a);
        System.out.println(Arrays.toString(a));
    }
}
