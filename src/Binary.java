public class Binary {
    public static int binary(int target){
        int sum=0;
        int tar = target;
        double length= Math.log10(target)+1;
        while(tar>0){
            sum+=Math.pow(tar%10,length);
            tar/=10;
        }
        return sum;
//        return bin(0,arr.length,arr,target);
    };
    public static int bin(int start,int end,int[] arr, int target){
        int mid = (start+end)/2;
        if (start>end)
            return 0;
        if (arr[mid]==target)
            return mid;
        else if (arr[mid]<target)
            return bin(mid+1,arr.length,arr,target);
        else
            return bin(start,mid-1,arr,target);
    };
    public static void main(String[] args) {
        int[] arr = {1,21,37,45,58,62,88,98,99};
        int target=15;
        System.out.println(binary(target));
    }}
