package BubbleSort;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,-1,0};
        bubbleSort(arr);
        for(int i : arr){
            System.out.print(i+"\t");
        }
    }
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = arr.length - 1; j>i; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
}
