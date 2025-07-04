import java.util.Arrays;

public class mergeSortInPlace {
    public static void main(String[] args) {
        int[] arr= {5,4,3,2,1};

        mergeSortInPlace(arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int[] arr, int s , int e){
        if(e-s ==0){
            return ;
        }
        int mid = (s+e)/2;

       mergeSortInPlace(arr, s, mid);
       mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s , mid , e);
    }
    private static void mergeInPlace(int[] arr, int s, int m , int e){
        int[] mix = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j< e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //it may be possible that one f the array is not finished
        // so add all the elements in the array

        //copy the remaining elements

        while( i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while( j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        System.arraycopy(mix, 0, arr, s + 0, mix.length);

    }
}
