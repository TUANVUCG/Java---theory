package SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,-3,5,7,12,4,2};
        selectionSort(arr);
        for(int i : arr){
            System.out.print(i+"\t");
        }
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int min = i;
            for(int j = i +1; j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
