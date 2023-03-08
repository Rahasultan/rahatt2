import java.util.Scanner;
public class SequentialSearch {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        System.out.println("enter the number that you search for:");
        int num = in.nextInt();
        int result=Search(array, num);
        if ( result== -1) System.out.println("not found");
        else System.out.println("found in index:" +result);

    }

    static int Search(int[] arr, int num) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == num)
                return i;
            i++;
        }
        return -1;
    }
}
