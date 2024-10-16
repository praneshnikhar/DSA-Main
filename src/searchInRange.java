//search for 3 in the range of index


public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14 , 28};
        int target = 3;
        System.out.println(linearSearch(arr, target, 1 , 4));

    }
    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return -1;
        }
        //run a for loop
        for (int index = start; index <= end; index++) {

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
