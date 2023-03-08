import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        shiftright(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] shiftright(int[] array) {
        for(int i = array.length - 1; i > 0; --i) {
            array[i] = array[i - 1];
        }

        array[0] = -2147483648;
        return array;
    }
}
