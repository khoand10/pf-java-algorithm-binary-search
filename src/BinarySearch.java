public class BinarySearch {
    static int binarySearch(int[]arr, int value){
        int row = 0;
        int heigh = arr.length - 1;
        while(heigh >=row){
            int mid = (row + heigh)/2;
            if(value == arr[mid]){
                return mid;
            }else if(value > arr[mid]){
                row = mid + 1;
            }else if(value < arr[mid]){
                heigh = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {3,5,7,9,10,33,44,50,90};
        int index = binarySearch(numbers,50);
        System.out.println(index);
    }
}
