public class MaxProdSubArray {
    public static int maxProduct(int[] nums) {
        int n=nums.length;
        int prod=nums[0]==0?1:nums[0];
        int maxProd=nums[0];
        int preProd=prod;
        for(int i=1;i<n;i++){
            prod=prod*nums[i];
            if(prod==0){
                preProd=1;
                maxProd=Math.max(maxProd,0);
                prod=1;
            }
            else{
                preProd=Math.max(preProd*nums[i],Math.max(prod,nums[i]));
                maxProd=Math.max(maxProd,preProd);
            }
        }
        int prod1=nums[n-1]==0?1:nums[n-1];
        int maxProd1=nums[n-1];
        int preProd1=prod1;
        for(int i=n-2;i>=0;i--){
            prod1=prod1*nums[i];
            if(prod1==0){
                preProd1=1;
                maxProd1=Math.max(maxProd1,0);
                prod1=1;
            }
            else{
                preProd1=Math.max(preProd1*nums[i],Math.max(prod1,nums[i]));
                maxProd1=Math.max(maxProd1,preProd1);
            }
        }
        return Math.max(maxProd1,maxProd);
        
    }
    public static void main(String[] args) {
        int arr[]={2,3,-2,4};
        int result=maxProduct(arr);
        System.out.println(result);
        
    }
}
