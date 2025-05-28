public class FirstAndLastInfinite {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,65,6,7,2};

        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target) {
        //first find the range
        //https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
        //firs tstart witha  box of size 2

        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target > arr[end]){
            int newStart = end + 1;
            //double the box value
            //end = previous end +size of box*2
            end = end + (end - start + 1 ) * 2;
            start = newStart;
        }
        return search(arr, target , start, end);
    }

    static int search(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid = start+ (end-start)/2;

            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
