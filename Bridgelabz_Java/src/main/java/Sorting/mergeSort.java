import java.util.*;

public class mergeSort {
    static void Divide(int[] arr, int st, int end) {

        if (st >= end) {
            return;
        }

        int mid = st + (end - st) / 2;

        Divide(arr, st, mid);
        Divide(arr, mid + 1, end);

        conquer(arr, st, mid, end);

    }

    static void conquer(int[] arr, int st, int mid, int end) {
        int temp[] = new int[end - st + 1];

        int i = st;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (int a = 0, b = st; a < temp.length; a++, b++) {
            arr[b] = temp[a];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 100, 109, 55, 78, 5, 90 };
        int st = 0;
        int end = arr.length - 1;

        Divide(arr, st, end);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}