import java.util.Arrays;
import java.util.Scanner;
public class Ex6 {
    static int numOfElements = 0;
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner in = new Scanner(System.in);

        for(int i = 0; i <= arr.length; ++i) {
            if (add(arr, in.nextInt())) {
                System.out.println(Arrays.toString(arr));
            } else {
                System.out.println("Array is full");
            }
        }

    }

    public static boolean add(int[] array, int newElement) {
        if (numOfElements < array.length) {
            array[numOfElements] = newElement;
            numOfElements++;
            return true;
        } else {
            return false;
        }
    }
}
