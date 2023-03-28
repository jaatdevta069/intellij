import java.util.HashMap;
import java.util.Map;

public class Songs {
    public static void main(String[] args) {
        Map<Integer,Integer> m= new HashMap<>();
        int[] arr= {10,20,30,40,50,60,80,100,120};
    for(int i=0;i< arr.length;i++) {
        int key = arr[i] % 60;
        if (m.containsKey(key)) {
            int contain = m.get(key);
            contain++;
            m.put(key, contain);
        } else {
            m.put(key, 1);
        }
    }
        int noofpairs=0;
        for (int key:m.keySet()){
            if (key<30 && key!=30 && key!=0){
                int value =m.get(key);
                if (m.get(60-key)!=null){
                   int correspondingentrycount=m.get(60-key);
                   noofpairs = noofpairs+(value*correspondingentrycount);
            }
                else if (key==30){
                        int count=m.get(key)/2;
                        noofpairs=noofpairs+count;
                    }
                else if(key == 0){
                    int count=m.get(key)/2;
                    noofpairs=noofpairs+count;
                }
        }
    }
        System.out.println(noofpairs);
    }
}
