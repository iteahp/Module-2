package thuchanh;

public class BinarySearch {
    static int[] list = {2,4,7,10,11,45,50,60,66,69,70,79};
    static int binarySearch(int[] list ,int key){
        int low = 0;
        int high= list.length-1;
        while (high>=low){
            int mid = (high+low)/2;
            if (list[mid]==key){
                return mid;
            }else if (list[mid]<key){
                low=mid+1;
            }else high = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,50));
        System.out.println(binarySearch(list,45));
        System.out.println(binarySearch(list,66));
        System.out.println(binarySearch(list,2));
    }
}
