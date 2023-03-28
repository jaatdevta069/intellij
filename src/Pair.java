import java.lang.*;
import java.util.ArrayList;

public class Pair {
    public static void main(String[] args) {

    int str[]= {10,20,30,40,50};
    int count=0;
    int a= str.length;
     for (int i=0;i<a;i++){
        for (int j=i+1;j<a;j++){
           if ((str[i]+str[j])%60==0){
              count=count+1;
           }
           else{
               continue;
           }
        }


    }
        System.out.println(count);

}}
