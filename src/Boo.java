import java.util.*;

public class Boo {
    public static void incr(int[] arr,int n){
        arr[2]=99;
        n=8;
       // System.out.println(i);
    }
    public static int n = 5;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer [] arr = {1,2,3,4,5};
        int k =0;
        //System.out.println(k);
      /*  for(int i : arr){
        System.out.print(i+" ");}

        incr(arr,n);
         for(int i : arr){
            System.out.print(i+" ");}*/
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        List<Integer> lis = Collections.nCopies(10,0);
        for(int i =0;i<10;i++){
                list.add(new ArrayList<>(Arrays.asList(-1,-1)));
        }
        //if(list.get(0)==null)
        Iterator<Integer> it = lis.iterator() ;
            while(it.hasNext()){
                System.out.println(it.next());
            }
      //  else
        //    System.out.println("lauda lele");
    }
}
