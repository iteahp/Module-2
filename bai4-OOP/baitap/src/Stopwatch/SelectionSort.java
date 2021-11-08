package Stopwatch;

public class SelectionSort {
    public void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<arr[min]){
                    min =j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=min;
        }
    }
    public  void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" , ");
        }
    }
}
