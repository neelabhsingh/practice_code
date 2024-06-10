package algo.search.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int []array = {2,3,5,6,7,8,9,10};
        int key = 11;
        int indexSearchElement = binarySearchRecursion(array, 0, array.length -1, key);
        System.out.println("Index of key "+ key +"is indexSearchElement :"+ indexSearchElement);
        int []array1 = {2,3,5,6,7,8,9,10};
        int key1 = 2;
        int indexSearchElement1 = binarySearchIterative(array, key1);
        System.out.println("Index of key "+ key1 +"is indexSearchElement :"+ indexSearchElement1);
    }
    public static int binarySearchRecursion(int [] array, int low, int high, int key){
        if(low <= high){
            int mid = low + (high - low)/2;
            if(array[mid] == key){
                return mid;
            }
            if(array[mid] > key){
                return binarySearchRecursion(array, low, mid - 1, key);
            }else{
                return binarySearchRecursion(array, mid +1 , high, key);
            }
        }else{
            return -1;
        }
    }
    public static int binarySearchIterative(int [] array, int key){
        int low = 0;
        int high = array.length;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(array[mid] == key){
                return mid;
            }
            if(array[mid]> key){
                high= mid -1;
            }else{
                low = mid +1;
            }
        }
        return  -1;
    }
}
