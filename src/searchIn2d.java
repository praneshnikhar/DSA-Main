public class searchIn2d {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4},{23,2,2}};
        int target  =34;
        System.out.println(search(arr, target));
    }
        static int search(int[][] arr,int target){
            for(int i = 0 ; i <arr.length;i++){
                for(int j = 0 ; j<arr[i].length    ;j++){
                    if(arr[i][j] == target){
                        return arr[i][j];
                    }
                }
            }
            return 1;
        }
}
