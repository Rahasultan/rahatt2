import java.util.Arrays;
public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] reverse(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            if (i < array.length / 2) {
                int n = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = n;
            }
        }

        return array;
    }
}
