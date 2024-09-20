import java.util.Arrays;
import java.util.HashMap;

public class ReplaceByRank {
    static void replaceByrankBtf(int arr[]){
        int rank=1;
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rank=1;
            int a=arr[i];
            for(int j=0;j<arr.length;j++) if(a>arr[j]) rank++;
            System.out.println(rank);
            ans[i]=rank;
        }
        System.out.println(Arrays.toString(ans));
    }
    static void replaceByRankBtr(int arr[])
    {
        int temp[]=new int [arr.length];
        int i=0;
        for(int a:arr)  temp[i++]=a;
        Arrays.sort(temp);
        HashMap <Integer,Integer> map=new HashMap<>();
        for( i=0;i<temp.length;i++) 
        {
            if(map.containsKey(temp[i])){
                int val=map.get(temp[i]);
                map.put(temp[i], val+1);
            }
            else map.put(temp[i], i+1);
        }
        for(int a:arr)
            System.out.print(map.get(a)+" ");
    }   

    public static void main(String[] args) {
        int arr[]={20,15,26,2,98,6};
        // Input: 20 15 26 2 98 6 // sorted --- 2 6 8 15 20 26 98 
        // Output: 4 3 5 1 6 2
        replaceByRankBtr(arr);
    }
}
