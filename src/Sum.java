import java.util.ArrayList;
import java.util.HashMap;
public class Sum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        System.out.println(twoSum(arr,10));
    }
    public static ArrayList<Integer> twoSum(int[] nums, int target) {
        ArrayList<Integer> list= new ArrayList<>(2);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ;i<nums.length;i++){
            if (map.containsKey(nums[i])){
                list.add(map.get(nums[i]));list.add(i);
                return list;}
            else{
                map.put(target-nums[i],i);
            }
    }
        return list;
}
}
