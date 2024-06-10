package algo.sorting.quick_sort;

public class QuickSort {
    public static void main(String[] args) {
        int [] array = {12, 23, 1, 3, 45, 0, 166};
        quickSort(array, 0, array.length-1);
        System.out.println(array);
        for(int num: array){
            System.out.print(num+", ");
        }
    }
    public static void quickSort(int [] array, int low, int high){
        if(low < high){
            int pivotIndex = partition1(array, low, high);
            quickSort(array, low, pivotIndex-1);
            quickSort(array, pivotIndex+1, high);
        }
    }
    public static int partition(int [] array, int low, int high){
        int pivot = array[high];
        int i = low -1;
        for(int j= low; j<high; j++){
            if(array[j]<=pivot){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, high);
        return i+1;
    }
    private static  int partition1(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }
    public static void swap(int [] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
