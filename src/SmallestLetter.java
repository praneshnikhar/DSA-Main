public class SmallestLetter {


    public static void main(String[] args) {
        int[] arr = {'c'};
        int target =4 ;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }

// LEETCODE - Q)744
//    class Solution {
//        public char nextGreatestLetter(char[] letters, char target) {
//            int start = 0;
//            int end = letters.length-1;
//
//            while(start<=end){
//                int mid = start+ (end-start)/2;
//
//                if(target<letters[mid]){
//                    end = mid-1;
//                }else{
//                    start = mid+1;
//                }
//            }
//            return letters[start% letters.length];
//
//        }
//    }


    static int ceiling(int[] letters, int target){
        if(target> letters[letters.length-1]){
            return -1;
        }
        int start = 0;
        int end = letters.length-1;

        while(start<=end){
            int mid = start+ (end-start)/2;

            if(target<letters[mid]){
                end = mid-1;
            }else if(target>letters[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
