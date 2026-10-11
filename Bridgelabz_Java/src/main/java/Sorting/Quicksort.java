public class Quicksort {
    static void quicksort(int[] arr, int st, int end) {
        if (st < end) {
            int pivIdx = partition(arr, st, end);
            quicksort(arr, st, pivIdx - 1); // left half
            quicksort(arr, pivIdx + 1, end); // right half
        }
    }

    static int partition(int[] arr, int st, int end) {
        int idx = st - 1;
        int pivot = arr[end];

        for (int j = st; j < end; j++) {
            if (pivot >= arr[j]) {
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[j];
                arr[j] = temp;
            }
        }
        idx++;
        int temp = arr[idx];
        arr[idx] = arr[end];
        arr[end] = temp;

        return idx;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 4, 3 };

        quicksort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
