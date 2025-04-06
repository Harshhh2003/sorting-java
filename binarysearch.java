public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {5, 8, 1, 2, 10, 11, 3};
        int key = 10;
        int idx = binarysearcharr(arr, key);

        if (idx == -1)
            System.out.println("given element is not present in the given array:");
        else
            System.out.println("element found at idx: " + idx);
    }

    public static int binarysearcharr(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
