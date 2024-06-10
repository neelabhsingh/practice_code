package interview.test;
//swap two numbers without using the third variable
//Fibonacci series with 50
//Sort an array
public class Test {
    public static void main(String [] args){
        swapNumber(5,3);
        printFibSeries();
        int [] num ={ 2,3, 1,4, 3};
        quickSort(num, 0, num.length -1);
    }
    public static void swapNumber(int a, int b){
        a = a + b;
        b = a -b;
        a = a - b;
        System.out.println("A:"+ a +", B"+b);
    }

    public static void printFibSeries(){
        int a =0;
        int b = 1;

        for(int i=0; i<50; i++){
            System.out.print(printFibSeriesUtil(i) +", ");
        }
    }
    public static int printFibSeriesUtil(int n){
        if(n==0 || n==1){
            return n;
        }
        return printFibSeriesUtil(n-1) + printFibSeriesUtil(n-2);
    }
    public static void sortUsingInsertion(int [] nums){
        for(int i=0; i< nums.length; i++){
            int j =i+1;
            while (j >=0){
                if(nums[j] < nums[i] ){
                    j--;
                }
            }

        }
    }

    private static void swap(int [] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    private static void quickSort(int [] array, int left, int right){
        if( left < right){
            int pivot = partition(array, left, right);
            quickSort(array, left, pivot -1);
            quickSort(array, pivot+1, right);
        }
    }
    private static int partition(int [] array, int left, int right){
        int pivot = array[right];
        int i = left;
        for(int j =left; j< right ; j++){
            if (array[j] <= array[pivot]){
                swap(array, i, j);
                i++;
            }
            swap(array, i, pivot);
        }
        return i;
    }

}
