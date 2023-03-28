//{ Driver Code Starts
//Initial Template for Java

import java.util.Scanner;

class kk
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];

            for(long i = 0; i < n; i++)
                arr[(int)i] = sc.nextLong();

            System.out.println(new Solution1().inversionCount(arr, n));

        }
    }
}

// } Driver Code Ends

//User function Template for Java

class Solution1
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        long cnt=0;
        for(int j =0;j<N-1;j++){
            for(int i =j+1;i<N;i++){
                if(arr[i]<arr[j]){
                    long temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    cnt++;
                }
            }}
        for(long i : arr){
            System.out.print(i);
        }
        return cnt;
    }
}