import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        rotateRight(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] rotateRight(int[] array) {
        int n = array[array.length - 1];

        for(int i = array.length - 1; i > 0; --i) {
            array[i] = array[i - 1];
        }

        array[0] = n;
        return array;
    }
}
