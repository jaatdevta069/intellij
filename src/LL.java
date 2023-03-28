public class LL {
    public static void swap(String[] arr,int i ,int j){
        String temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        //String str = new String("abacbab");
        String[] arr= {"china","aapan","america","india","england"};
        for(int i =0;i<arr.length-1;i++){
            for(int j =i+1;j< arr.length;j++){
                if(arr[i].length()>arr[j].length()){
                    swap(arr,i,j);
                } else if (arr[i].length()==arr[j].length()){
                    if((arr[i].compareTo(arr[j]))>0){
                        swap(arr,i,j);
                    }
                }
            }
        }
        for(String s: arr){
            System.out.println(s);
        }
}}
