public class mergesort {
    public static void main(String[] args) {
        int[] arr = {2, 10, 15, 17, 10, 6};
        int n = arr.length;

        mergesorting(arr, 0, n - 1);

        System.out.println("Sorted array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    } public static void mergesorting(int[] a, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergesorting(a, l, mid);
            mergesorting(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    } public static void merge(int[] a, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
  int[] left = new int[n1];
        int[] right = new int[n2];
 for (int i = 0; i < n1; i++) {
            left[i] = a[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = a[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }  while (i < n1) {
            a[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = right[j];
            j++;
            k++;
        }
    }
}
