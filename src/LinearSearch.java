//find weather 14 exist in arry or not


public class LinearSearch {
//    how many check will the loop mae on the best case i.e element found at 0th index
//    worst case: iterate or go through every item and it the end it says not found

    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 3, 5, 21, 4, 5, 90};
        int target = 21;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        }



    // search in the array: return the index if item found
    //otherwise if item not found


    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {

            //check for element at every index if it = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }

        //this line will execute if none of the return statements above have excuted , hence the target not found

        return -1;
    }

}