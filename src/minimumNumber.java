//find minimum number in the array
public class minimumNumber {
    public static void main(String[] args) {
        int[] arr = {18, 12,-2, 3, 14, 28};
        System.out.println(min(arr));

    }
//assume arr.length != 0
//return the minimum value in the arra;y

    static int min(int[] arr) {
        int ans = arr[0];
        for(int i =1; i<arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }

    return ans;
}}