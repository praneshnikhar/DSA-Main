public class OrderAgnostics {
    public static void main(String[] args) {
        int[] arr={1,3,4,54,5,6,7,};
        int target = 4;

        System.out.println(orderAgnosticsBS(arr, target));
    }

    static int orderAgnosticsBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //find whetther the array is sorted in asccending or descending;
        boolean isAsc = arr[start]<arr[end];



        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target <arr[mid]){
                    end = mid-1;
                }else  {
                    start = mid + 1;
                }
            } else{
                if(target >arr[mid]){
                end = mid-1;
            }else {
                start = mid + 1;
            }
}
        }
        return -1;
    }
}
