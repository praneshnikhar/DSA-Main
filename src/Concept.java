//INFINTE RECURRSION




public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static  void fun(int n ){
        if ( n==0){
            return ;
        }
        System.out.println(n);
//        fun(n--);
        fun(--n);

//            n-- vs --n they are not similar
//        in n-- it will pass 5 first , ans subtract 1 later , in -- it will subtract first and then pass the value of n
    }
}
