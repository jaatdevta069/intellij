import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Mmm {
    public static void main(String args[]) {
        int basket = 25;
        Vegetable v1 = new Vegetable("V1", 15, 9);
        Vegetable v2 = new Vegetable("V2", 16, 7);
        Vegetable v3 = new Vegetable("V3", 17, 6);
        Vegetable v4 = new Vegetable("V4", 18, 4);
        Vegetable v5 = new Vegetable("V5", 25, 8);

        List<Vegetable> list = new ArrayList<>();
        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5);

        // for(int i =0; i<list.size();i++){
        //    System.out.println("before sorting : "+list.get(i).getPrice());
        //}
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("after sorting : " + list.get(i).getPrice());
        }
        System.out.println("");
        for (int i = 0; i < list.size(); ++i) {
            System.out.println("after sorting : " + list.get(i).getPrice());
        }
/*int i=0;
        while(basket>0){
            if((basket - (list.get(i).getQuantity())) >= 0){
                System.out.println("taking1 "+list.get(i).getVegetableName()+" weight "+list.get(i).getQuantity());
                basket=basket-list.get(i).getQuantity();
            }
            else{
                System.out.println("taking "+list.get(i).getVegetableName()+" weight "+basket);
            }
            i++;
        }
        System.out.println("END");
    }}*/
    }
}
