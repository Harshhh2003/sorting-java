public class quicksort {
  public static void main(String[] args) {
      int[] arr = {6, 3, 4, 1, 10, 45, 21};
      int n = arr.length;
       quicksorting(arr, 0, n - 1);
       System.out.println("SORTED ARRAY IS:");
      for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
      }
  }public static void quicksorting(int[] arr, int low, int high) {
      if (low < high) {
          int pivot = partition(arr, low, high);
          quicksorting(arr, low, pivot - 1);
          quicksorting(arr, pivot + 1, high);
      }
  } public static int partition(int[] arr, int low, int high) {
      int pivot = arr[low];
      int i = low + 1;
      int j = high;
  while (i <= j) {
          while (i <= j && arr[i] <= pivot) {
              i++;
 }
          while (i <= j && arr[j] > pivot) {
              j--;
          }
          if (i < j) {
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
          }
      }

      int temp = arr[low];
      arr[low] = arr[j];
      arr[j] = temp;

      return j;
  }
}
