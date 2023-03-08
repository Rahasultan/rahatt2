public class BinarySearch {
    public static boolean search(int[ ] data, int target, int low, int high) {
        if (low > high)
            return false;
        else {
            int mid = (low + high) / 2;
            if (target == data[mid])
                return true;
            else if (target < data[mid])
                return search(data, target, low, mid-1); // recur left of the middle
            else
                return search(data, target, mid + 1, high); // recur right of the middle
        }
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(search(a,2,1,4));

    }
}
