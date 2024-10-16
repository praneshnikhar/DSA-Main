import java.util.Arrays;

public class insertionSort{

    public static void main(String[] args){
        int[] arr= {5, 4, 3, 2, 1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+ 1; j > 0 ; j--) {
                if(arr[j] < arr[j-1] ){
                    swap(arr, j , j-1);
                }else{
                    break;
                }

            }

        }
    }

    static void swap(int[] arr, int a , int b ){
        int temp = a;
        b = temp;
    }

    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i = 0; i< arr.length; i++){
            swapped = false;

            //for each step, max item , will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;

                }
            }

            if (!swapped){
                break;
            }
        }
    }
}