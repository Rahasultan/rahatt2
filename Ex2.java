import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        shiftLeft(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] shiftLeft(int[] array) {
        for(int i = 0; i < array.length - 1; ++i) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = -2147483648;
        return array;
    }
}
