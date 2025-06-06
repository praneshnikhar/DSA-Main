class missingNum {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i]< arr.length  && arr[i] != arr[arr[i]]){
                swap(arr, i , arr[i]);
            }else{
                i++;
            }
        }
        for(int index = 0 ; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr, int first , int second ){
        int temp =arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
