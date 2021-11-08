package Stopwatch;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr.length -i;
        }

        StopWatch watch = new StopWatch();
        SelectionSort sort1 = new SelectionSort();
        System.out.println("Mảng ban đầu : ");
        sort1.printArray(arr);
        watch.start();
        sort1.sort(arr);
        watch.stop();
        System.out.println(" Mảng sau khi sắp xếp");
        sort1.printArray(arr);
        System.out.println(" \n Thời gian thực hiện sắp xếp :   " +watch.getElapsedTime());


    }

    }

