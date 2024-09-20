import java.util.Arrays;

public class RotateArrayByk {
    static void rotateArrayBtf(int []arr,int k)
    {
        int n=arr.length;
        int ans[]=new int [n];
        int j=0;
        for(int i=n-k;i<n;i++)
            ans[j++]=arr[i];
        for(int i=0;i<n-k;i++) ans[j++]=arr[i];
        System.out.println(Arrays.toString(ans));
        
    }
    static void rotateArrayOpt(int arr[],int k){
        int n=arr.length;
        //number of unique rotations 
        k=k%n;
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-k-1);
        reverse(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i++]=arr[j];
            arr[j--]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        // for k=2 Output: 6 7 1 2 3 4 5 , right rotation
        // rotateArrayBtf(arr, 2);
        rotateArrayOpt(arr, 2);
    }
}
