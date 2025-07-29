public class FindInMountain {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0 , peak);
        if(firstTry != -1){
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target , peak+1, arr.length-1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]> arr[mid+1]){
                //you are in decreasing part of array.
                //this may be the answer but look at the left;
                //this is why end !=mid-1;
                end = mid;
            }
            else{
                //you are in asc order of the array;
                start = mid+1;//becuase we knw that mid+1 element > mid element
            }
        }
        //in the end , start== end , and pointing to the largest because of the two checks above
        //start and end are always trying to find max element in the above two checks,
        //hence , when they are pointing to just one element. that is the max one , because that is what the checks say
        //more elaboration: at every point of time for stat and end , they have the best possible answer till that time,
        // and if are saying that only one item is remaining , hence cuz of above line is the best possible answer.
        return start;

    }

    static int orderAgnosticBS(int[] arr, int target, int start , int end) {

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
