import java.util.Scanner;
class Sonu {
    static int i = 1;
    int j = 2;

    static class KK {
        static void pf() {
            System.out.println("this is " + i);
        }
    }

    public class LL {
        void print() {
            KK.pf();
            System.out.println("this is dusri class me" + i + j);
        }
    }
}

public class Pad {
//    static public double str(Double n) {
//        System.out.println("done");
//        return Double.valueOf(String.format("%.2f", n));
//    }
    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////        int c = sc.nextInt();
////        HashMap<Integer,Integer> map = new HashMap<>();
////        int[] arr = new int[]{a,b,c};
////        int j=0,sum=0,tem=0;
////        while(j<arr.length){
////            sum=arr[j];
////            while (sum>0){
////                tem=sum%10;
////                if((!map.containsKey(tem))&&j==0)
////                    map.put(tem,1);
////                else if(map.containsKey(tem))
////                    map.put(tem,map.get(tem)+1);
////            sum/=10;
////            }j++;}
////        for(Integer yk : map.values()){
////            System.out.println(yk);
////        }
////            for(Map.Entry<Integer,Integer> y : map.entrySet()){
////                if(y.getValue()>=3)
////                    System.out.print(y.getKey());
////            }
////        for(int i =0;i<10;i+=2){
////            System.out.println();
////        }
////                System.out.println(~5);
//
//       // System.out.println(str(5.646464));
////        Sonu.KK j = new Sonu.KK();
////        j.pf();
//        Sonu k = new Sonu();
//        Sonu.LL m = k.new LL();
//        m.print();
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        try{
        int[] arr = {1,2,3,4,5,6};
        for(int i =0;i<7;i++){
            System.out.println(arr[i]);
            cnt++;
        }}
        catch (Exception e){
            System.out.println("bahar nikal gaya vro or haan size hai "+cnt);
        }
        //System.out.println(cnt);

    }}