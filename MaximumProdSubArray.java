class MaximumProdSubArray{
    static void prodBtf(int arr[]){
        int prod=1;
        int maxProd=1;
        for(int a:arr)
        {
            prod*=a;
            if(prod>maxProd)    maxProd=prod;
            if(prod==0) prod=1;
        }
        System.out.println(maxProd);
    }
    static void prodOptm(int arr[])
    {
        int prefProd=1;
        int sufProd=1;
        int ans=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            prefProd*=arr[i];
            sufProd*=arr[n-i-1];
            ans=Math.max(prefProd,sufProd);
            if(prefProd==0) prefProd=1;
            if(sufProd==0) sufProd=1;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr[]={1,2,-3,0,-4,-5};
        // prodBtf(arr);
        prodOptm(arr);
    }
}