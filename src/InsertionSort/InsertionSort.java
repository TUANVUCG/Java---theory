package InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {0, -1, 4, 3, 7, 2};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

    public static void insertionSort(int[] arr) {
        int pos;
        int x;
        for (int i = 1; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = x;
        }
    }
}
